//Display name of a day based on number.
//Find type of website and the protocol used. i.e take url as an input. find the protcol used (http,ftp,https), also the type of website (.com (commercial),.gov,.org,.net etc)
package conditionals;

import java.util.Scanner;

public class challenge3 {
    public static void main(String args[])
    /*{
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a day number: ");
        int day = sc.nextInt();
        if (day==1) {
            System.out.println("Day 1: Monday");
        } else if (day==2) {
            System.out.println("Day 2: Tuesday");
        } else if (day==3) {
            System.out.println("Day 3: Wednesday");
        } else if (day==4) {
            System.out.println("Day 4: Thursday");
        } else if (day==5) {
            System.out.println("Day 5: Friday");
        } else if (day==6) {
            System.out.println("Day 6: Saturday");
        } else if (day==7) {
            System.out.println("Day 7: Sunday");
        }
        else System.out.println("Number invalid");
    } */
   {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a url of your choice: ");
        String url = sc.nextLine();
        int a = url.indexOf(":");
        String protocol = url.substring(0, a);
        System.out.println(protocol);
        if (protocol.equals("http")) { //finding protocol of website
            System.out.println(protocol+ " Hypertext transfer protocol.");
        } else if(protocol.equals("https")){
            System.out.println(protocol+ " secured protocol is used");
        } else if (protocol.equals("ftp")) {
            System.out.println(protocol+" file transfer protocol is used");
        } else System.out.println("Protocol invalid");
        // finding type of website i.e extension
        int index = url.lastIndexOf(".");
        String lastUrl = url.substring(index+1);
        if (lastUrl.equals("com")) {
            System.out.println(lastUrl + " is a commercial website");
        } else if (lastUrl.equals("net")) {
            System.out.println(lastUrl + " is a network website");
        } else if (lastUrl.equals("org")) {
            System.out.println(lastUrl + " is a organisation website");
        } else if (lastUrl.equals("gov")) {
            System.out.println(lastUrl + " is a government website");
        } else System.out.println("website not valid"); 
   }
}    
