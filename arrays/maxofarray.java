package arrays;
import java.lang.*;

public class maxofarray {
    public static void main(String[] args){
        int[] a={2,4,6,8,10,9};
        int max = a[0];
        for(int i=0; i<a.length; i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        System.out.println("Maximum value in array is: "+max);
    }
}