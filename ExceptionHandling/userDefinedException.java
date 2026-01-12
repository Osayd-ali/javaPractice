//Demonstration of user defined exception, where we can create our own exception by extending exception class and overriding its methods.
package ExceptionHandling;

class minBalanceException extends Exception{
    public String toString(){
        return "Balance Should not be less than 5000";
    }
}
public class userDefinedException {
    public static void main(String[] args){
        try {
            throw new minBalanceException();
        }
        catch(minBalanceException e) {
            System.out.println(e.toString());
        }
    }
}
