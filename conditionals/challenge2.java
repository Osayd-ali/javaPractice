// Find radix of a number given in a string. i.e radix means a number is in which form binary, octal, hexadecimal or decimal.
// Find a given year is a leap year.

package conditionals;

import java.util.Scanner;

public class challenge2 {
    public static void main(String args[])
    /*{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number in binary, octal, hexadecimal or decimal form: ");
        String str = sc.nextLine();
        if (str.matches("[01]+")) {
            System.out.println("Number is in Binary form, Radix = 2");
        } else if (str.matches("[0-7]+")) {
            System.out.println("Number is in Octal form, Radix = 8");
        } else if (str.matches("[0-9 A-F]+")) {
            System.out.println("Number is in Hexadecimal form, Radix = 16");
        } else if (str.matches("[0-9]+")) {
            System.out.println("Number is in Decimal form, Radix = 10");
        } else System.out.println("Number is invalid");
    }*/    
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an year: ");
        int year = sc.nextInt();
        if (year%4==0) 
        {
            if (year%100==0) 
            {
                if (year%400==0) {
                    System.out.println(year + " is a leap year");
                } 
                else 
                {
                    System.out.println(year + " is not a leap year");
                }
            }
            else
            {
                System.out.println(year + " is a leap year");
            }
        } 
        else 
        {
            System.out.println(year+" is not a leap year");
        }
    }
}
