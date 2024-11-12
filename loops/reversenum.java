package loops;
import java.lang.*;
import java.util.Scanner;

public class reversenum {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=s.nextInt();
        int r;
        int rev = 0;
        while(n>0){
            r = n%10; //extracting last remaining digit from number and storing it in r.
            rev = rev*10 + r; //Storing reversed final number here.
            n=n/10; //Shifting the position of number from ones to tenths and tenths to hundreds and so on.
        }
        System.out.println("The reversed number is: " + rev);
    }
}