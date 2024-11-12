// Demonstration of synchronization between threads by using the concept of monitor.
package Multithreading;

class MyData { // Through this class we will create an object which will be able to display each character of a string
    synchronized public void display(String str){ //The object of this class itself is a monitor which is responsible for scheduling of its own access between threads. By the use of synchronized keyword this is possible.
        for (int i = 0; i < str.length(); i++) {
                System.out.print(str.charAt(i));
                try{
                    Thread.sleep(1000);
                }
                catch (Exception e){
                    System.out.println(e);
                }
        }
    }
}
class Mythreadd1 extends Thread{
    MyData d;
    public Mythreadd1(MyData d){
        this.d = d;
    }
    public void run(){
        d.display("Hello World");
    }
}
class Mythreadd2 extends Thread{
    MyData data;
    public Mythreadd2(MyData data){
        this.data = data;
    }
    public void run(){
        data.display("Osayd");
    }
}
public class syncDemo {
    public static void main(String[] args){
        MyData d = new MyData();
        Mythreadd1 t1 = new Mythreadd1(d);
        Mythreadd2 t2 = new Mythreadd2(d);
        t1.start();
        t2.start(); //Both threads are sharing the same resource that is the object d of class MyData. we will synchronize both the threads in a way that the first thread uses d first and then second thread uses d.
    }
}