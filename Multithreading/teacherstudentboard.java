// Demonstration of multiple consumers and a single producer which demonstrates inter thread communication.
// In this program, there is a whiteboard which can be considered as our shared object between teacher and students.
// Teacher acts as a producer, and writes on the whiteboard and waits until all the students has read the statement from the whiteboard.
// Students acts as multiple consumer, and all the students read from the whiteboard one by one. once every student has read, the students wait until new statement is written on the whiteboard by the teacher.
// The responsibility of counting the number of students is given to whiteboard
// this is an example of race condition which shows, once the statement is written there will be a race between multiple students to read the statement.
package Multithreading;

class WhiteBoard{ // this is going to be our shared object which will be shared between teacher and multiple students
    String text;
    int noOfStudents = 0;
    int count = 0; // this acts as our flag, when count is 0 teacher will be able to write and when it is non-zero this means students are reading and the teacher should wait until all the students have read.
    public void attendance(){
        noOfStudents++;
    }
    synchronized public void write(String msg){
        System.out.println("Teacher is writing " + msg);
        while(count!=0){
            try{
                wait();
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
        text = msg;
        count = noOfStudents;
        notifyAll();
    }
    synchronized public String read(){
        String student_msg;
        while (count == 0){
            try{
                wait();
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
        student_msg = text;
        count--; // student excluding himself from the count indicating that he has read the message and removes himself from the list.
        if (count == 0){
            notify(); // notifying the teacher that the count is zero and he can write the message.
        }
        return student_msg;
    }
}
class Teacher extends Thread{ //Teachers acts as a producer and is responsible for writing in the shared object that is the whiteboard.
    WhiteBoard wb;
    String notes[] = {"Java is a language", "It is OOPS", "It is platform independent", "It supports Thread", "end"};
    public Teacher(WhiteBoard wb1){
        this.wb = wb1;
    }
    public void run(){
        for(int i=0; i< notes.length; i++){
            wb.write(notes[i]);
        }
    }
}
class Students extends Thread{ // A thread of students which will have multiple objects of students.
    String std_name;
    WhiteBoard wb;
    public Students(String std_name, WhiteBoard wb2){
        this.std_name = std_name;
        this.wb = wb2;
    }
    public void run(){
        String text;
        wb.attendance();

        do {
            text = wb.read();
            System.out.println(std_name + " reading " + text);
            System.out.flush();
        }while(!text.equals("end"));
    }
}
public class teacherstudentboard {
    public static void main(String[] args){
        WhiteBoard wb_main = new WhiteBoard();
        Teacher tch1 = new Teacher(wb_main);
        Students student1 = new Students("student_1", wb_main);
        Students student2 = new Students("student_2", wb_main);
        Students student3 = new Students("student_3", wb_main);
        tch1.start();
        student1.start();
        student2.start();
        student3.start();
    }
}