package arrays;
import java.lang.*;

public class reversecopyarray {
    public static void main(String[] args){
        int[] a = {2,4,6,8,10,12};
        int[] b = new int[6];
        for(int i=a.length-1, j=0; i>=0; i--,j++){
            b[j] = a[i];
        }
        for(int j=0; j<b.length; j++){
            System.out.print(b[j] + ", ");
        }
    }
}