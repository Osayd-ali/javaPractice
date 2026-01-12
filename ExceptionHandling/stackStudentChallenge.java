// Create a userdefined exception when stack pointer == -1 as stack underflow.
// Create a userdefined exception when stack pointer == size-1 as stack overflow.
// Create a stack class with push and pop methods which will also throw the above exceptions.
// Also test the program with a main method
package ExceptionHandling;

class stackUnderflowException extends Exception {
    public String toString(){
        return "Stack is Empty";
    }
}
class stackOverFlowException extends Exception{
    public String toString(){
        return "Stack is full";
    }
}
class stackClass {
    private int size;
    private int top = -1;
    private int S[];
    public stackClass(int sz){
        this.size = sz;
        this.S = new int[sz];
    }
    public void push(int x) throws stackOverFlowException{
        if(top == size-1){
            throw new stackOverFlowException();
        }
        top++;
        S[top] = x;
    }
    public int pop() throws stackUnderflowException{
        int x = -1;
        if(top == -1){
            throw new stackUnderflowException();
        }
        x = S[top];
        top--;
        return x;
    }
}
public class stackStudentChallenge {
    public static void main(String[] args) {
        stackClass stk = new stackClass(5);
        try {
            stk.push(10);
            stk.push(20);
            stk.push(30);
            stk.push(40);
            stk.push(50);
            stk.push(60);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

