package lambdaExpressions;

interface myLambda{
    public void display();
}
public class lambdaDemo {
    public static void main(String[] args){
        myLambda m = ()->{System.out.println("Lambda expression demo");}; // essentially writing a method without any name, anonymously.
        m.display();
    }
}