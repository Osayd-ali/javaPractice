// Display name of a day based on number.
// Display name of a month based on number.
// Display type of website.
package conditionals;

import java.util.Scanner;

public class switch1 {
    public static void main(String args[])
    /*{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day number and month number: ");
        int day = sc.nextInt();
        int month = sc.nextInt();
        switch (day) {
            case 1: System.out.println("Monday");
                    break;
            case 2: System.out.println("Tuesday");    
                    break;
            case 3: System.out.println("Wednesday");
                    break;
            case 4: System.out.println("Thursday");
                    break;
            case 5: System.out.println("Friday");
                    break;
            case 6: System.out.println("Saturday");
                    break;
            case 7: System.out.println("Sunday");
                    break;        
            default: System.out.println("Invalid day");
                break;
        }
        switch (month) {
            case 1: System.out.println("January");
                break;
            case 2: System.out.println("February");
                break;    
            case 3: System.out.println("March");
                break;    
            case 4: System.out.println("April");
                break;
            case 5: System.out.println("May");
                break;
            case 6: System.out.println("June");
                break;
            case 7: System.out.println("July");
                break;
            case 8: System.out.println("August");
                break;
            case 9: System.out.println("September");
                break;
            case 10: System.out.println("October");
                break;
            case 11: System.out.println("November");
                break;
            case 12: System.out.println("December");
                break;                
            default: System.out.println("Invalid");
                break;
        } 
    }*/
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a URL: ");
        String url = sc.nextLine();
        String ext = url.substring(url.lastIndexOf(".")+1);
        switch (ext) {
            case "com": System.out.println("Commercial website");
                break;
            case "net": System.out.println("Networking website");
                break;
            case "gov": System.out.println("Government website");
                break;
            case "org": System.out.println("Organisation website");
                break;
        
            default: System.out.println("Website not valid");
                break;
        }
    }
}
