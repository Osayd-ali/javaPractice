package conditionals;
import java.lang.*;
import java.util.*;

public class ifpractice {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        int a = sc.nextInt();
        if (a>0) {
            System.out.println(a + " is a positive integer.");
        } 
        else 
        System.out.println(a + " is a negative integer.");
    }    
}
