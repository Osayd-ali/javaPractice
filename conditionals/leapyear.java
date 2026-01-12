package conditionals;
import java.lang.*;
import java.util.Scanner;
public class leapyear {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = s.nextInt();
        if(year%4==0){
            if(year%100==0 && year%400!=0){
                System.out.print(year+" not a leap year");
            } else {
                System.out.println(year+" is a leap year");
            }
        }
        else System.out.println(year + " not a leap year");
    }
}