package conditionals;
import java.util.Scanner;
import java.lang.*;//find a number is odd or even
public class evenOdd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = s.nextInt();
        if(a%2==0) {
            System.out.println(a + " is even number");
        } else {
            System.out.println(a + " is odd number");
        }
    }
}