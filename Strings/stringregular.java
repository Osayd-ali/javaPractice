package Strings;// Find if mail is gmail or not, also find username and domain name
import java.lang.*;
import java.util.Scanner;

class stringregular {
public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter email address: ");
    String email = s.next();
    boolean mail_check = email.matches(".*gmail.*");
    System.out.println(mail_check);
    int index = email.indexOf("@");
    String user_name = email.substring(0,index);
    String domain = email.substring(index);
    int index2 = email.lastIndexOf(".");
    String type = email.substring(index2);
    if(type.equals(".com"))
        System.out.println("Commercial website");
    else if (type.equals(".org")) {
        System.out.println("Organisation website");
    }
    else System.out.println("Invalid website");
    System.out.println("username is: " + user_name);
    System.out.println("Domain name is: "+ domain);
}
}