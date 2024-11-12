//Demonstration of throw and throws keywords. throw is used to actually throw to exception object by creating an object of exception class (builtin or user defined)
//Throws is used for indicating that the method is throwing an exception, we use it in method definition itself
package ExceptionHandling;

public class throwthrows {
    static int area(int l, int b) throws Exception{
        if(l<0 || b<0){
            throw new Exception();
        }
        return l*b;
    }
    static void meth1() throws Exception{
        System.out.println("Area is: " + area(-10,20));
    }
    public static void main(String[] args){
        try{
            meth1();
        }
        catch(Exception e){
            System.out.println("Negative values entered, area cannot be calculated " + e);
        }
    }
}