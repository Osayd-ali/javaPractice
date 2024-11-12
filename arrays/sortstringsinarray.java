package arrays;
import java.lang.*;

public class sortstringsinarray {
    public static void main(String[] args){
        String arr[] = {"java", "python", "pascal", "smalltalk", "ada", "basic"};
        java.util.Arrays.sort(arr);
        for(String x:arr){
            System.out.print(x + " ");
        }
    }
}