package loops;
import java.lang.*;
import java.util.Scanner;

public class palindrome {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = s.nextInt();
        int digit = n;
        int rev = 0;
        while(digit>0){
            int r=digit%10;
            rev = rev*10 + r;
            digit = digit/10;
        }
        if(rev == n){
            System.out.println(n+ " is a palindrome");
        } else System.out.println(n+ " is not a palindrome");
    }
}