package loops;
import java.lang.*;
import java.util.Scanner;

public class multable {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number whose table you want: ");
        int n = s.nextInt();
        for (int i=1; i<=10; i++){
            int result = n*i;
            System.out.println(result);
        }
    }
}