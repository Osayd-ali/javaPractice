package arrays;
import java.lang.*;


public class deletionofelement {
    public static void main(String[] args){
        int index=2;
        int[] a={2,4,5,6,7,8,9,0,0};
        int temp = index+1;
        for(int i=temp; i<a.length; i++){
            a[i-1] = a[i];
        }
        for(int x:a){
            System.out.print(x+ ", ");
        }
    }
}