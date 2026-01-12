package loops;
import java.lang.*;
import java.util.Scanner;

public class displaydigits {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = s.nextInt();
        while (n>0){
            int r = n%10; // extracting the last digit of number as remainder, this value will be returned
            n=n/10; // once remainder was extracted from above step, the units digit will become 0 and we divide by 10 to move to 10th digit position and so on.
            System.out.println(r);
        }
    }
}