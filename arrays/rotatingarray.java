package arrays;
import java.lang.*;

public class rotatingarray {
    public static void main(String[] args){
        int[] a = {2,4,6,8,10};
        for(int x:a){
            System.out.print(x+ ", ");
        }
        System.out.println("");
        int t = a[0];
        for(int i=1; i<a.length; i++){
            a[i-1] = a[i];
        }
        a[a.length-1]=t;
        for(int x:a){
            System.out.print(x+ ", ");
        }
    }
}