package arrays;
import java.lang.*;

public class searchelement {
    public static void main(String[] args){
        int[] a = {2,4,6,8};
        int key=6;
        for(int i=0; i<a.length; i++){
            if(a[i]==key){
                System.out.println(i);
                System.exit(0);
            }

        }
        System.out.println("Element  not found");
    }
}