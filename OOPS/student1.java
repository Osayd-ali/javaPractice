package OOPS;

class Student{
    public int roll;
    public String name;
    public String course;
    public int m1, m2, m3;
    public int total(){
        return m1 + m2 + m3;
    }
    public double average(){
        return (double) total()/3;
    }
    public char grade(){
        if(average()>70){
            return 'A';
        }
        else if (average()<70 && average()>60){
            return 'B';
        }
        else if(average()<60 && average()>50){
            return 'C';
        }
        else if(average()<50 && average()>40){
            return 'D';
        }
        else
            return 'F';
    }
}
public class student1 {
    public static void main(String args[]){
        Student std1 = new Student();
        std1.roll = 10;
        std1.name = "Osayd";
        std1.course = "Computer Science";
        std1.m1 = 50;
        std1.m2 = 60;
        std1.m3 = 80;
        System.out.println("Student Details: ");
        System.out.println("Name: " + std1.name + ", Roll no: " + std1.roll + ", Course: " + std1.course);
        System.out.println("Total marks = " + std1.total());
        System.out.println("Average = " + std1.average());
        System.out.println("Final Grade: " + std1.grade());
    }
}