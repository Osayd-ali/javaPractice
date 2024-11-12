package arrays;
import java.lang.*;

public class insertinarray {
    public static void main(String[] args){
        int[] a = {2,3,5,6,8,0};
        for(int x:a){
            System.out.print(x + ", ");
        }
        System.out.println("");
        for(int i=a.length-2; i>1; i--){
            a[i+1] = a[i];
        }
        a[2] = 9;
        for(int x:a){
            System.out.print(x + ", ");
        }
    }
}