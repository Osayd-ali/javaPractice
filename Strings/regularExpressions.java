package Strings;
import java.lang.*;

public class regularExpressions {
    public static void main(String[] args)
    {
        String str="p";
        String str1="abcde";
        String str2="accccc";
        System.out.println(str.matches(".")); // Here we are checking whether the string in str matches the regular expression, str.matches method returns boolean value.
        System.out.println(str.matches("[abc]")); // [abc] suggests string must have either a or b or c.
        System.out.println(str1.matches(".*")); // demonstration of quantifiers and symbols
        System.out.println(str1.matches(".?"));
        System.out.println(str2.matches("abc+"));
        System.out.println(str2.matches("[abc]{3,7}")); // quantifier flower braces suggest that there must be atleast 3 characters and upto 7 characters.
        // real life example when we want to check whether a user has entered correct email address.
        String email="john@gmail.com";
        System.out.println(email.matches(".*gmail.*")); // so here we are checking that the mail must contain gmail, before gmail any character with any no.of times can be used and after gmail also same.
        System.out.println(email.matches("\\w*@gmail.*")); // before @gmail only alphabets or numbers must be there hence used meta characters.
    }    
}
