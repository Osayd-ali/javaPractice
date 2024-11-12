//Demo of java generics. Here we see how a single generic object is created.
package Generics;

class Data<T>{
    private T obj;
    public void setObj(T v){
        obj = v;
    }

    public T getObj() {
        return obj;
    }
}
public class genericDemo {
    public static void main(String[] args){
        Data<String> d=new Data<>();
        d.setObj("hi");       //or d.setObj(new String("hello"));
        System.out.println(d.getObj());
    }
}