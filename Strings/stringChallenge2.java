// Write a program to check whether a string contains binary numbers or not, check it using regular exprsns.
// Also find whether a string contains hexadecimal numbers or not, using RE.
// Also find whether a given data is in a date format (i.e dd/mm/yyyy)
package Strings;
import java.lang.*;

public class stringChallenge2 {
    public static void main(String[] args)
    {
        int b = 10100010;
        String str = b+"";
        String  str2 = "1023456AB";
        String str3 = "09/06/2001";
        System.out.println(str.matches("[01]+"));
        System.out.println(str2.matches("[0-9 A-F]+"));
        System.out.println(str3.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));
    }    
}
