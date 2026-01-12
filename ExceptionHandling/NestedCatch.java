package ExceptionHandling;

public class NestedCatch {
    public static void main(String[] args){
        int A[] = {30,20,40,10,0};
        int c=A[0]/A[1];
        System.out.println("The result is: " + c);
        try {
            try {
                c = A[0] / A[4];
                System.out.println("The result is: " + c);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero, Division invalid! " + e);
            }
            System.out.println(A[5]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Element trying to get displayed is out of bounds of the array: " + e);
        }
    }
}