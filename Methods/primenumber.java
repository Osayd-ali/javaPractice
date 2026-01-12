package Methods;

import java.util.Scanner;

public class primenumber {
    static boolean prime(int n){
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = s.nextInt();
        System.out.println(prime(a));
    }
}