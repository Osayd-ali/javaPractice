//Demonstration of multithreading by implementing runnable interface. Here we show how two different parts of the program can run at the same time. We assign a thread to
// one part of the program and start the thread so that, that part will run at the same time as main method.
package Multithreading;

class My implements Runnable {
    public void run(){
        int i=1;
        while(i<=10){
            System.out.println(i + " Hello");
            i++;
        }
    }
}
public class multithreadingrunnableint {
    public static void main(String[] args){
        My m = new My();
        Thread t1 = new Thread(m);
        t1.start();
        int i=1;
        while(i<=10){
            System.out.println(i + " World");
            i++;
        }
    }
}