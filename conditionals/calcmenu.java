// Make a calculator menu and ask the user to choose one function on 2 numbers. use switch case for development
package conditionals;

import java.util.Scanner;

public class calcmenu {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two numbers for performing operation: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("ADD  SUB  MUL  DIV");
        System.out.println("Enter operation you want to perform: ");
        sc.nextLine();
        // reading integers before string creates a problem where in the next line it will not take a string but it takes the enter key we press after entering 2nd number, hence this function takes that enter key and the next function will take our actual input.
        String oprn = sc.nextLine();
        switch (oprn) {
            case "ADD": System.out.println("Addition of a and b is: " + (a+b));
                break;
            case "SUB": System.out.println("Subtraction of a and b is: " + (a-b));
                break;
            case "MUL": System.out.println("Multiplication of a and b is: " + (a*b));
                break;
            case "DIV": System.out.println("Division of a and b is: " + (a/b));
                break;        
                default: System.out.println("Operation invalid");
                break;
        }
    }
}
