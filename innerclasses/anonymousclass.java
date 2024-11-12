//Demonstration of anonymous class
package innerclasses;

abstract class anotest{
    public abstract void show();
}
class Outer__class{
    public void dissplay(){
        anotest a = new anotest() {
            @Override
            public void show() {
                System.out.print("Hello word this is anonymous class example");
            }
        };
        a.show();
    }
}
public class anonymousclass {
    public static void main(String[] args){
        Outer__class oc = new Outer__class();
        oc.dissplay();
    }
}