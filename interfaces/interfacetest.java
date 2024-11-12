package interfaces;

interface test{
    void meth1();
    void meth2();
}
class interface_implementation implements test {
    public void meth1(){
        System.out.println("First implementation of meth1");
    }
    public void meth2(){
        System.out.println("First implementation of meth2");
    }
}
public class interfacetest {
    public static void main(String[] args){
        test t = new interface_implementation();
        t.meth1();
        t.meth2();
    }
}