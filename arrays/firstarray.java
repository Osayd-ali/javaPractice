package arrays;
import java.lang.*;
import java.util.Scanner;

public class firstarray {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = s.nextInt();
        int[] a = new int[size];
        System.out.println("Enter the elements: ");
        for(int i=0; i<size; i++){
            a[i] = s.nextInt();
        }
        System.out.println("Array elements are: ");
        for(int i=0;i<size; i++){
            System.out.print(a[i] + ", ");
        }
    }
}