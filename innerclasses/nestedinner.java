//Demonstration of nested inner class.
package innerclasses;

class Outer_class{
    String x = "Global variable of outer class";
    class Inner_class{
        String y = "Local variable of inner class";
        public void innerDisplay(){
            System.out.println(x);
            System.out.println(y);
        }
    }
    public void outerDisplay(){
        Inner_class in = new Inner_class();
        in.innerDisplay();
        System.out.println(in.y);
    }
}
public class nestedinner {
    public static void main(String[] args){
        Outer_class o = new Outer_class();
        o.outerDisplay();
    }
}
