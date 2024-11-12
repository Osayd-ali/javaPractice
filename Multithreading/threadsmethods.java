//Demonstration of different thread methods, thread class constructors etc.
package Multithreading;

class MyThread1 extends Thread {
    public MyThread1(String name){
        super(name);
        setPriority(Thread.MAX_PRIORITY);
    }
    public void run(){
      int i = 1;
        while(i<10){
            System.out.println(i++);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
public class threadsmethods {
    public static void main(String[] args){
        MyThread1 th = new MyThread1("Thread 1");
        th.start();
        System.out.println("ID: " + th.threadId());
        System.out.println("Name: " + th.getName());
        System.out.println("State: " + th.getState());
        System.out.println("Priority: " + th.getPriority());
        System.out.println("Alive: " + th.isAlive());
    }
}