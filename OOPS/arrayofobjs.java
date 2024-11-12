package OOPS;

class Subject{
    private int SubID;
    private String subj_name;
    private int maxMarks;
    private int marksObtain;
    public Subject(int SubID, String subj_name, int maxMarks, int marksObtain){
        this.SubID = SubID;
        this.subj_name = subj_name;
        this.maxMarks = maxMarks;
        setMarksObtain(marksObtain);
    }
    public void setMarksObtain(int marksObtain){
        this.marksObtain = marksObtain;
    }
    public int getSubID(){ return SubID;}
    public String getSubj_name(){ return subj_name; }
    public int getMaxMarks(){ return maxMarks;}
    public int getMarksObtain(){ return marksObtain;}
    public String toString(){
        return "\nSubject ID: "+SubID+"\nSubject name: "+subj_name+"\nMax Marks: "+maxMarks+"\nMarks Obtained: "+marksObtain;
    }
}
class Student__{
    private int rollNo;
    private String name;
    private String dept;
    private String[] subjects;
    public int getRollNo(){ return rollNo;}
    public String getName(){ return name;}
    public String getDept(){ return dept;}
    public String[] getSubjects(){
        return subjects;
    }
    public void setDept(String dept){
        this.dept = dept;
    }
    public void setSubjects(String[] subjects){
        this.subjects = subjects;
    }
    public Student__(int rollNo, String name, String dept, String[] subjects){
        this.rollNo = rollNo;
        this.name = name;
        setDept(dept);
        setSubjects(subjects);
    }
}

public class arrayofobjs {
    public static void main(String args[]){
        Subject subs[] = new Subject[3]; //creating array of object references;
        subs[0] = new Subject(202, "Maths", 100, 60);
        subs[1] = new Subject(203, "Physics", 80, 50);
        subs[2] = new Subject(204, "Chemistry", 80, 45);

        for(Subject s:subs){
            System.out.println(s);
        }
        String[] sub_std0 = {"Algorithms", "Operating Systems", "Compiler Design"};
        String[] sub_std1 = {"Math", "Operating Systems", "Compiler Design"};
        String[] sub_std2 = {"Science", "Operating Systems", "Compiler Design"};
        Student__ stds[] = new Student__[3];
        stds[0] = new Student__(245, "Osayd", "CS",sub_std0);
        stds[1] = new Student__(246, "Tamim", "IT",sub_std1);
        stds[2] = new Student__(247, "Mirza", "ECE",sub_std2);
        System.out.println("\nRoll No: "+stds[0].getRollNo()+"\nStudent name: "+stds[0].getName()+"\nDept: "+stds[0].getDept());
        System.out.println("Subjects: ");
        for(String s: stds[0].getSubjects()){
            System.out.println(s);
        };
        System.out.println("\nRoll No: "+stds[1].getRollNo()+"\nStudent name: "+stds[1].getName()+"\nDept: "+stds[1].getDept());
        System.out.println("Subjects: ");
        for(String s: stds[1].getSubjects()){
            System.out.println(s);
        };
        System.out.println("\nRoll No: "+stds[2].getRollNo()+"\nStudent name: "+stds[2].getName()+"\nDept: "+stds[2].getDept());
        System.out.println("Subjects: ");
        for(String s: stds[2].getSubjects()){
            System.out.println(s);
        };
    }
}