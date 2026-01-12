package arrays;
import java.lang.*;

public class copyarray {
    public static void main(String[] args){
        int[] a = {2,4,6,8,10,12};
        int[] b = new int[6];
        for(int i=0; i<a.length; i++){
            b[i] = a[i];
        }
        for(int j=0; j<b.length; j++){
            System.out.print(b[j] + ", ");
        }
    }
}