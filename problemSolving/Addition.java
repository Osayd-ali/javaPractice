import java.lang.*;
import java.util.*;

class Addition 
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int a , b;
        System.out.println("Enter 2 numbers: ");
        a = s.nextInt();
        b = s.nextInt();
        int c = a+b;
        System.out.println("Sum is " + c);
    }    
}
