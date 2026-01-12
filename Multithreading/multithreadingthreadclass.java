//Demonstration of multithreading by extending thread class. Here we show how two different parts of the program can run at the same time. We assign a thread to
// one part of the program and start the thread so that, that part will run at the same time as main method.
package Multithreading;

class MyThread extends Thread {
    public void run(){
        int i=1;
        while(true){
            System.out.println(i + " Hello");
            i++;
        }
    }
}
public class multithreadingthreadclass {
    public static void main(String[] args){
        MyThread t = new MyThread();
        t.start();
        int i=1;
        while(true){
            System.out.println(i + " World");
            i++;
        }
    }
}