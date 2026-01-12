// Demonstration of order of execution of parameterized constructor.
package Inheritance;

class Parent{
    public Parent(){
        System.out.println("Non param constructor of parent");
    }
    public Parent(int x){
        System.out.println("Parameterised constructor of parent: " + x);
    }
}
class Child extends Parent{
    public Child(){
        System.out.println("Non param constructor of child");
    }
    public Child(int y){
        System.out.println("Parameterised constructor of child: " + y);
    }
    public Child(int x, int y){
        super(x);
        System.out.println("2 parameterised constructor of child: " + y);
    }
}
public class paramconstr {
    public static void main(String[] args){
        Child c1 = new Child(); //calling default constructors of both parent and child
        Child c2 = new Child(10); //Default constructor of parent will be called since we did not provide x arg, and param constructor of child will be called.
        Child c3 = new Child(20,30); //Param constructors of both parent and child will be called.
    }
}