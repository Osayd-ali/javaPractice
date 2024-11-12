package Inheritance;

class Account{
    private int accno;
    private String name;
    private String address;
    private String phno;
    private String dob;
    private double balance;
    public Account(int accno, String name, String address, String phno, String dob){
        this.accno = accno;
        this.name = name;
        this.address = address;
        this.phno = phno;
        this.dob = dob;
        this.balance = balance;
    }
    public int getAccno(){ return accno;}
    public String getName(){ return name;}
    public String getPhno(){ return phno;}
    public String getAddress(){ return address;}
    public String getDob(){ return dob;}
    public double getBalance(){ return balance;}
    public void setBalance(double balance){ this.balance = balance; }
    public void setAddress(){
        this.address = address;
    }
    public void setPhno(){
        this.phno = phno;
    }

}
class SavingsAccount extends Account {
    public SavingsAccount(int accno, String name, String address, String phno, String dob){
        super(accno, name, address, phno, dob);
    }
    public String deposit(double amount){
        double balance = getBalance();
        balance = balance + amount;
        setBalance(balance);
        return "Deposit successful, updated balance is: " + balance;
    }
    public String withdraw(double amount){
        double balance = getBalance();
        if (amount <= balance){
            balance = balance - amount;
            setBalance(balance);
            return "Withdrawal successful, updated balance is: " + balance;
        }else return "Withdrawal failed, insufficient funds.";
    }
    public String toString(){
        return "Account Details: " + "\n \t account number: " + getAccno() + "\n \t name: " + getName() + "\n \t address: " + getAddress() + "\n \t phone no: " + getPhno() + "\n \t dob: " + getDob();
    }
}
public class BankAccount {
    public static void main(String[] args){
        SavingsAccount user1 = new SavingsAccount(223,"Osayd","501 E 32nd st", "723456789", "09/06/2001");
        System.out.println(user1);
        System.out.println(user1.deposit(500));
        System.out.println(user1.withdraw(200));
    }
}
