//Demonstration of final keyword in its various forms
package staticfinal;

final class Test1{
    public final void display(){
        System.out.println("Hello");
    }
}
//class Test2 extends Test1{
    //public void display(){
        //System.out.println("Overriding final method not possible");
    //}
//}
//class Test3 extends Test1 (extending not possible as test1 class is final)
public class FinalPractice {
    public static void main(String[] args){
        final int x = 10;
        //x = 20; not possible as x was declared final hence we cannot reassign new value to it.
        System.out.println(x);
    }
}