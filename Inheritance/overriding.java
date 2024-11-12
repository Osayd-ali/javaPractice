package Inheritance;

class Super{
    public void display(){
        System.out.println("Super Class Display");
    }
}
class Sub extends Super{
    @Override
    public void display(){
        System.out.println("Sub Class Display");
    }
}
public class overriding {
    public static void main(String[] args){
        Super sc = new Sub();
        sc.display();
    }
}
