//Student challenge of creating a menu-driven account program.
package collections;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

class Account implements Serializable {
    String accountNo;
    String userName;
    double accountBalance;

    Account(){} //As we are achieving serialization there should be a non parameterized constructor
    public Account(String accountNo, String userName, double accountBalance){
        this.accountNo = accountNo;
        this.userName = userName;
        this.accountBalance = accountBalance;
    }
    public String toString(){
        return "Account no: "+accountNo+"\nName: "+userName+"\nBalance: "+accountBalance+"\n";
    }
}
public class menuAccountProg {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Account acc = null; //Reference of account whenever required we'll use this reference.
        HashMap<String, Account> hm = new HashMap<>();

        //After starting our program, our program must take the objects saved in the file and put it in hashmap
        try{
            FileInputStream fis = new FileInputStream("/Users/mirhamedali/Desktop/java/collections/Account.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            int count = ois.readInt();
            for(int i=0; i<count; i++){
                acc = (Account) ois.readObject();
                System.out.println(acc);
                hm.put(acc.accountNo, acc);
            }
            fis.close();
            ois.close();
        } catch(Exception e){}

        //Here we are actually giving a menu to the user and performing multiple operations in the hash table based on his choice
        //We are also saving all the objects from the hash table into the file Account.txt
        FileOutputStream fos = new FileOutputStream("/Users/mirhamedali/Desktop/java/collections/Account.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        System.out.println("Menu for Account Operations!");
        int choice ;
        String accNo, name;
        double balance;
        do {
            System.out.println("1. Create new Account");
            System.out.println("2. Delete Account");
            System.out.println("3. View Account");
            System.out.println("4. View all Accounts");
            System.out.println("5. Save Accounts");
            System.out.println("6. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            sc.skip("(\r\n)|[\n\r]?");

            switch(choice){
                case 1: System.out.println("Enter details Account No, Name, Balance: ");
                        accNo = sc.nextLine();
                        name = sc.nextLine();
                        balance = sc.nextDouble();
                        acc = new Account(accNo, name, balance);
                        hm.put(accNo, acc);
                        System.out.println("Account created for: "+ name);
                        break;
                case 2: System.out.println("Enter account number whose account you want to delete: ");
                        accNo = sc.nextLine();
                        hm.remove(accNo); //removing the value (account object) based on key(account number) provided,
                        break;
                case 3: System.out.println("Enter account number to view account: ");
                        accNo = sc.nextLine();
                        acc= hm.get(accNo);
                        System.out.println(acc);
                        break;
                case 4: System.out.println("Viewing all accounts");
                        for(Account ac : hm.values()){
                            System.out.println(ac);
                        }
                        break;
                case 5:
                case 6: oos.writeInt(hm.size());
                        for(Account ac : hm.values()){
                            oos.writeObject(ac);
                        }
                        break;
                default: System.out.println("Invalid choice! Select options from 1 to 6");
            }
        }while(choice!=6);
        oos.flush();
        oos.close();
        fos.close();

    }
}