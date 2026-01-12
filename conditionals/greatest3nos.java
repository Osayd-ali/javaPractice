package conditionals;
import java.lang.*;
public class greatest3nos {
    public static void main(String[] args)
    {
        int a=15, b=20, c=10;
        if (a>b && a>c) {
            System.out.println(a+ " is the greatest among three numbers.");
        } else if (b>c) {
            System.out.println(b+" is the greatest among three numbers.");
        } else {
            System.out.println(c + " is the greatest among three numbers");
        }
    }    
}
