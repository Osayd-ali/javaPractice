package arrays;
import java.lang.*;


public class insertvalue {
    public static void main(String[] args){
        int n = 20;
        int index=2;
        int[] a={2,4,5,6,7,8,9,0,0};
        int temp = a.length-2;
        for(int i=temp; i>index; i--){
            a[i] = a[i-1];
        }
        a[index]=n;
        for(int x:a){
            System.out.print(x+ ", ");
        }
    }
}