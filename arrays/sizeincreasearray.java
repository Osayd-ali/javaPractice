package arrays;
import java.lang.*;

public class sizeincreasearray {
    public static void main(String[] args){
        int[] a = {2,3,4,5,6};
        int[] b = new int[2*a.length];
        for(int i=0; i<a.length; i++){
            b[i] = a[i];
        }
        a = b;
        b = null;
        for(int x:a){
            System.out.print(x + ", ");
        }
    }
}