//Demonstration of local inner class
package innerclasses;

class outer {
    public void Display(){
        class Inner{
            public void show(){
                System.out.println("Hello world");
            }
        }
        Inner i = new Inner();
        i.show();
    }
}
public class localinnerclass {
    public static void main(String[] args){
        outer o = new outer();
        o.Display();
    }
}