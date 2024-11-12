package loops;
import java.lang.*;
import java.util.Scanner;

public class factorial {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number whose factorial you want: ");
        int n = s.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
             fact = fact*i;
        }
        System.out.println("Factorial is: "+fact);

    }
}