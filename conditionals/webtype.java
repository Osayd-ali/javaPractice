package conditionals;
import java.awt.*;
import java.lang.*;
import java.util.Scanner;
public class webtype {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a website url: ");
        String url = s.next();
        String protocol = url.substring(0,url.indexOf(':'));
        String type = url.substring(url.lastIndexOf('.'));
        if(protocol.equals("http")){
            System.out.println(protocol+" Hyper-text transfer protocol");
        } else if (protocol.equals("ftp")) {
            System.out.println(protocol+" File transfer protocol");
        } else if (protocol.equals("https")) {
            System.out.println(protocol+" Hyper-text transfer protocol secured");
        } else {
            System.out.println("Invalid website");
        }
        if(type.equals(".com")){
            System.out.println(type+" Commercial website");
        } else if (type.equals(".gov")) {
            System.out.println(type+" Government website");
        } else if (type.equals(".org")) {
            System.out.println(type+" Organisation website");
        } else if (type.equals(".net")) {
            System.out.println(type+" Network website");
        } else {
            System.out.println("Invalid website");
        }
    }
}
