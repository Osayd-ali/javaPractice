// Write a program to check whether a given string email is gmail or not, separate the username and domain from the orginal string and return true if domain is gmail.
package Strings;
import java.lang.*;

public class stringChallenge1 {
    public static void main(String[] args)
    {
        String str="programmer@gmail.com";
        int i=str.indexOf("@");
        String domain=str.substring(i+1);
        System.out.println(domain.equals("gmail.com"));
        String username=str.substring(0, i);
        System.out.println("username is: " + username + " domain is: " + domain);
    }
}
