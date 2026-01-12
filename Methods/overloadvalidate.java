package Methods;

public class overloadvalidate {
    static double area(double l, double b){
        return l*b;
    }
    static double area(double r){
        return Math.PI*r*r;
    }
    static int reverse(int n){
        int reverse_final = 0;
        int r;
        while(n>0){
            r=n%10;
            reverse_final = reverse_final*10 + r;
            n=n/10;
        }
        return reverse_final;
    }
    static int[] reverse(int[] A){
        int[] reverse_array = new int[6];
        for(int i=A.length-1, j=0;i>=0;i--, j++){
            reverse_array[j]=A[i];
        }
        return reverse_array;
    }
    static boolean validate(String name){
        return (name.matches("[a-zA-Z\\s]+"));
    }
    static boolean validate(int age){
        return age>=3 && age<=15;
    }
    public static void main(String args[]){
        int A[]={3,4,5,6,7,8};
        System.out.println("Area of rectangle is: "+ area(30,20));
        System.out.println("Area of circle is: "+ area(6));
        System.out.println("Reverse of 456 number is: "+ reverse(456));
        System.out.println("Reverse of array {3,4,5,6,7,8} is: ");
        int[] reversed_array = reverse(A);
        for(int x:reversed_array){
            System.out.print(x + ", ");
        }
        System.out.println();
        System.out.println(validate("Osayd"));
        System.out.println(validate(14));
    }
}