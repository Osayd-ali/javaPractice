//Demonstration of try with resources, where we see how resources like filestream, scanner are handled with try.
//We must close these resources once we are done using them, one way is using finally block and closing them manually.
//But try with resources handles closing of resources automatically without us manually closing them.
package ExceptionHandling;

import java.io.FileInputStream;
import java.util.Scanner;

public class trywithResources {
    static void Divide() throws Exception{
        try(FileInputStream fi = new FileInputStream("/Users/mirhamedali/Desktop/file1.txt"); Scanner sc = new Scanner(fi)){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            System.out.println(a/d);
        }
    }
    public static void main(String[] args){
        try{
            Divide();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}