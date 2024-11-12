//Student challenge where we do not pass the roll no, account no,
// and customer no while creating the object in the constructor, but we generate sequential numbers from the class itself
package staticfinal;

import java.util.Date;

class Student{
    private String rollNo;
    private String studentName;
    private String courseName;
    private static int count = 1;
    public String getStudentName(){
        return studentName;
    }
    public String getCourseName(){
        return courseName;
    }
    public String getRollNo(){
        return rollNo;
    }
    private String generateRollNo(){
        Date d = new Date();
        String rn = "Univ-" + (d.getYear() + 1900)+ "-" + count;
        count++;
        return rn;
    }
    public Student(String studentName, String courseName){
        this.rollNo = generateRollNo();
        this.studentName = studentName;
        this.courseName = courseName;
    }
    public String toString(){
        return "Student Details: " + "\nStudent Name: " + studentName + "\nStudent Course: " + courseName + "\nRoll No: " + rollNo;
    }
}
public class StudentChallenge {
    public static void main(String[] args){
        Student s1 = new Student("Osayd", "CSE");
        Student s2 = new Student("Michael", "Mechanical");
        System.out.println(s1);
        System.out.println(s2);
    }
}
