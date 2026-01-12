package Inheritance;
//Example of dynamic method dispatch which shows runtime polymorphism. i.e. which object's methods to be used are decided at runtime.
class Super_{
    public void meth1(){
        System.out.println("Super method1");
    }
    public void meth2(){
        System.out.println("Super method2");
    }
}
class sub_ extends Super_{
    @Override
    public void meth1(){
        System.out.println("Sub meth1");
    }
    @Override
    public void meth2(){
        System.out.println("Sub meth2");
    }
    public void meth3(){
        System.out.println("Sub meth3");
    }
}
public class dynamicmethoddispatch {
    public static void main(String[] args) {
        Super_ sc = new sub_();
        sc.meth1();
        sc.meth2();
        //sc.meth3(); cannot be accessed as when we are creating the object of sub class we are using the reference of Super_ class so only those methods which are in reference class can be accessed.
    }
}