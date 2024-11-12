//Demonstration of finally block
package ExceptionHandling;

public class finallydemons {
    public static void main(String[] args){
        try{
            System.out.println(10/0);
        }
        catch(ArithmeticException  e){
            System.out.println("Cannot divide by zero " + e);
        }
        finally {
            System.out.println("Final message");
        }
    }
}