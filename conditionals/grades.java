package conditionals;
import java.lang.*;
import java.util.Scanner;

public class grades {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter marks for m1, m2, m3: ");
        int m1 = s.nextInt();
        int m2 = s.nextInt();
        int m3 = s.nextInt();
        int total = m1 + m2 + m3;
        float avg = (float)total/3;
        if(avg >= 70){
            System.out.println("Grade A");
        } else if (avg<70 && avg>=60) {
            System.out.println("Grade B");
        } else if (avg<60 && avg>=50) {
            System.out.println("Grade C");
        } else if (avg<50 && avg>=40) {
            System.out.println("Grade D");
        } else {
            System.out.println("Grade F");
        }
        System.out.println("Average is: " + avg);


    }
}