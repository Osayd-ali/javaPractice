package Strings;
import java.lang.*;
import java.util.*;

import static java.lang.String.valueOf;

public class Stringmethods {
    public static void main(String[] args)
    {
        String str = new String("netbeans");
        char c=str.charAt(5);
        int l=str.length();
        String str1=str.toUpperCase();
        String str2="Mr.Shahrukh Khan";
        String str4="mr.Shahrukh Khan";
        String str3=str.substring(3, 8);
        System.out.println(str2.startsWith("Mr."));
        System.out.println(str2.indexOf("S"));
        System.out.println(str2.equals(str)); // returns true if the content of one string is equal to the content of another string.
        System.out.println(str2.equalsIgnoreCase(str4)); // ignores the cases and compares the content of two strings.
        System.out.println(str2 == str4); // == operator only compares the references or addresses the variables hold and not the content.
        System.out.println(c);
        System.out.println(l);
        System.out.println(str1);
        System.out.println(str);
        System.out.println(str2.substring(0,11));
        System.out.println(str2.replace('h','p'));
        System.out.println(str3);
        System.out.println(str.startsWith("net"));
        System.out.println(str2.lastIndexOf("a"));
        String str_in = new String(valueOf( 'a'));
        System.out.println(str_in);

    }
}
