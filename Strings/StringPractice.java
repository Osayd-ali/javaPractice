package Strings;
import java.lang.*;
import java.util.*;

public class StringPractice {
    public static void main(String args[])
    {
        String str1 = "Java Program";
        String str2 = new String("JAVA");
        char c[]={'A','B','C','D'};
        String str3 = new String(c);
        String str4 = new String(c,2,2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        int l = str2.length();
        System.out.println(l);
        String str5 = str2.toLowerCase();
        System.out.println(str5);
    }
}
