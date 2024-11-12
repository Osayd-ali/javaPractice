package loops;
import java.lang.*;
import java.util.Scanner;

public class fibonacciseries {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Program to print fibonacci series");
        System.out.println("Enter zeroth value a, first value b, no. of terms n: ");
        int a=s.nextInt();
        int b=s.nextInt();
        int n=s.nextInt();
        int c;
        int count = 0;
        System.out.print(a + ", ");
        System.out.print(b + ", ");
        while(count < n-2){
            c = a + b;
            System.out.print(c + ", ");
            a=b;
            b=c;
            count++;
        }
    }
}