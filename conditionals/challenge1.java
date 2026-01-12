// Find a number is odd or even
// Find person is young or not young
// Find grades for given marks
package conditionals;
import java.lang.*;
import java.util.Scanner;

public class challenge1 {
    public static void main(String args[])
    /* {  // code for even odd numbers
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your preferred number: ");
        int num=sc.nextInt();
        if (num%2==0) {
            System.out.println(num + " is an even number");
        } else {
            System.out.println(num + " is an odd number");
        }
    } */
    // code for age
    /* {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        if(age>18 && age<=45)
        {
            System.out.println("You are young adult");
        }else System.out.println("Your are not young");
    } */
    // Code for alloting grades 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your marks for three subjects: ");
        int m1,m2,m3;
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        int avg = (m1+m2+m3)/3;
        if (avg>=70) {
            System.out.println("Grade: A");
        } else if (avg<70 && avg>=60) {
            System.out.println("Grade: B");
        } else if (avg<60 && avg>=50) {
            System.out.println("Grade: C");
        } else if (avg<50 && avg>=40) {
            System.out.println("Grade: D");
        } else System.out.println("Grade: F");
    }   
}
