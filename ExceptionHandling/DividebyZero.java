// In this program we are trying to divide a number by zero and catching that particular exception then showing a message of invalid input.
package ExceptionHandling;

import java.util.Scanner;

public class DividebyZero {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the values for numerator and denominator");
        a = s.nextInt();
        b = s.nextInt();
        try{
            c = a/b;
            System.out.println("Result is " + c);
        }
        catch (ArithmeticException e){
            System.out.println("Denominator cannot be zero, division cannot happen " + e);
        }
    }
}