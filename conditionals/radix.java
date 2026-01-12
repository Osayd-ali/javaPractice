package conditionals;
import java.lang.*;
import java.util.Scanner;

public class radix {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number is binary, decimal, octal or hexadecimal: ");
        String num = s.nextLine();
        if(num.matches("[01]+")){
            System.out.println("Radix is 2, Binary");
        } else if (num.matches("[0-9]+")) {
            System.out.println("Radix is 10, Decimal");
        } else if (num.matches("[0-7]+")){
            System.out.println("Radix is 8, Octal");
        } else if (num.matches("[0-9 A-F]+")) {
            System.out.println("Radix is 16, Hexadecimal");
        } else
            System.out.println("Number invalid");
    }
}