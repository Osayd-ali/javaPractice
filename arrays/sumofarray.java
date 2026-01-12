package arrays;
import java.lang.*;
import  java.util.Scanner;

public class sumofarray {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 5 elements of array: ");
        int[] a = new int[5];
        for(int i=0; i<5; i++){
            a[i]=s.nextInt();
        }
        int sum=0;
        for(int x:a){
            sum=sum+x;
        }
        System.out.println("Sum of array items is: " + sum);
    }
}