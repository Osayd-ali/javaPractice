// Demonstration of inter thread communication, through the example of producer and consumer problem.
// producer and consumer both are trying to use the same shared object. Producer tries to write in the object and consumer will read the same value written by producer in the shared object.
// Once producer writes or sets value in the object, it will make flag as false and notify the consumer that the shared object is ready to use.
// Once consumer reads or gets the value from the shared object, it will make flag as true and notify the producer that the shared object is ready to use.
package Multithreading;

class Datamy { // this is the shared object which both producer and consumer is going to use to write and read values from the object.
    int value = 0;
    boolean flag = true; // Only when flag is true producer will be able to set or write the value in the object.
    synchronized public void setValue(int v){
        while (flag!=true){ // As long as flag is false, this means the consumer has not taken the value. So producer has to wait till the consumer has taken the value and set flag as true.
            try{
                wait(); // producer should wait until the flag has been changed to true by consumer.
            }
            catch (InterruptedException e){
                System.out.println(e);
            }
        }
        value = v;
        flag = false; // After setting the value, producer should change the flag to false.
        notify(); // Notify the consumer that the value is set and ready to be taken by the consumer. shared object is ready to be used by consumer.
    }
    synchronized public int getValue(){
        int x = 0;
        while (flag!=false){
            try{
                wait(); // consumer should wait until the flag has been changed to false by producer.
            }
            catch (InterruptedException e){
                System.out.println(e);
            }
        }
        x = value; //Putting value in x and returning x so that consumer can take the value.
        flag = true; // After putting value in x, producer should change flag to true indicating that it has taken the value.
        notify(); //Notify the producer that the value is taken and next value should be set by producer. shared object is ready to be used by producer.
        return x;
    }
}
class Producer extends Thread{
    Datamy d1;
    public Producer(Datamy data1){
        this.d1 = data1;
    }
    public void run(){
        int i = 1;
        while(true){
            d1.setValue(i);
            System.out.println("producer: " + i);
            i++;
        }
    }
}
class Consumer extends Thread{
    Datamy d2;
    public Consumer(Datamy data2){
        this.d2 = data2;
    }
    public void run(){
        while(true){
            System.out.println("Consumer: " + d2.getValue());
        }
    }
}
public class producerconsumer {
    public static void main(String[] agrs){
        Datamy data_main = new Datamy();
        Producer p1 = new Producer(data_main);
        Consumer con1 = new Consumer(data_main);
        p1.start();
        con1.start();
    }
}