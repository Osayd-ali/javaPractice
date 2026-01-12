//Demonstration of how a singleton class works
package staticfinal;

class CoffeeMachine{
    private float coffeeQty;
    private float waterQty;
    private float sugarQty;
    private static CoffeeMachine object_ = null;
    private CoffeeMachine(){
        coffeeQty = 1;
        waterQty = 1;
        sugarQty = 1;
    }
    public static CoffeeMachine getInstance(){
        if (object_ == null){
            object_ = new CoffeeMachine();
        }
        return object_;
    }
}
public class singletonexample {
    public static void main(String[] args){
        CoffeeMachine c1 = CoffeeMachine.getInstance();
        CoffeeMachine c2 = CoffeeMachine.getInstance();
        CoffeeMachine c3 = CoffeeMachine.getInstance();
        System.out.println(c1 + " " + c2 + " " + c3);
        if (c1==c2 && c1==c3){
            System.out.println("Same");
        }
    }
}