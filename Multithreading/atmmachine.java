package Multithreading;

class MyATM{ //this is the shared object which is being shared by multiple customer objects. Our aim is that only one customer at a time must be accessing the shared object.
    synchronized public void checkBalance(String name){
        System.out.print(name + " checking");
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println(" Balance");
    }
    synchronized public void withdraw(String name, int amt){
        System.out.print(name + " withdrawing");
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println(" "+amt);
    }
}
class Customer extends Thread{
    String name;
    int amt;
    MyATM atm;
    public Customer(String name, int amt, MyATM atm){
        this.name = name;
        this.amt = amt;
        this.atm = atm;
    }
    public void useATM(){
        atm.checkBalance(name);
        atm.withdraw(name,amt);
    }
    public void run(){
        useATM();
    }
}
public class atmmachine {
    public static void main(String[] args){
        MyATM atm = new MyATM();
        Customer c1 = new Customer("Osayd",150,atm);
        Customer c2 = new Customer("Tamim",350,atm);
        c1.start();
        c2.start();
    }
}