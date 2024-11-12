package conditionals;
import java.lang.*;
import java.util.Scanner;

public class young{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        if(age>=18 && age<45){
            System.out.println("Adult");
        } else if (age>=45) {
            System.out.println("Old");
        }
        else
            System.out.println("Child");


    }
}