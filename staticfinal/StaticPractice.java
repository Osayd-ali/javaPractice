//Demonstration of how static members work
package staticfinal;

class Test{
    static int x = 10;
    int y = 20; //non static variable
    void show(){
        System.out.println(x + " " +y+ " showing through non static method, hence static and non static variables can be accessed.");
    }
    static void display(){
        System.out.println(x + " " + " Cannot access non static variable y as this method is static, so it will access only static variables or members.");
    }
}
public class StaticPractice {
    public static void main(String[] args){
        Test t1 = new Test();
        Test t2 = new Test();
        t1.show();
        t2.show();
        Test.display();
    }
}
