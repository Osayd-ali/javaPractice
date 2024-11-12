package arrays;
import java.lang.*;

public class secondlargest {
    public static void main(String[] args){
        int[] a={2,5,6,7,4,9};
        int max1=a[0];
        int max2=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max1){
                max2=max1;
                max1=a[i];
            } else if (a[i]>max2) {
                max2=a[i];
            }
        }
        System.out.println("Second largest element is: "+max2);
    }
}