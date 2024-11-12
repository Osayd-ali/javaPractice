package loops;
import java.lang.*;
import java.util.Scanner;

public class armstrong {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=s.nextInt();
        int digit = n;
        int result = 0;
        while(digit>0){
            int r=digit%10;
            digit=digit/10;
            result = result + (r*r*r);
        }
        if(result == n){
            System.out.println(n+" is an Armstrong number");
        } else System.out.println(n+" is not an Armstrong number");
    }
}
