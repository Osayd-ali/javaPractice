package loops;
import java.lang.*;
import java.util.Scanner;

public class Arithmeticseries {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first value a, common difference d, no. of terms n: ");
        int a=s.nextInt();
        int d=s.nextInt();
        int n=s.nextInt();
        int count = 0;
        while(count < n){
            System.out.print(a + ", ");
            a = a + d;
            count++;
        }
    }
}