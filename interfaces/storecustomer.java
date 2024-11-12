// In this program we are trying to make a system, where there is a store and has some customers as its members.
//Whenever a sale is going on in store, it will send a callback to its members saying come and pick items early before normal customers come in.
package interfaces;

interface Member{
    void callback();
}
class store{
    Member mem[]= new Member[100];
    int count = 0;
    public void register(Member m){
        mem[count++] = m;
    }
    public void inviteSale(){
        for(int i = 0; i<count; i++){
            mem[i].callback();
        }
    }
}
class Customer implements Member{
    String name;
    public Customer(String name){
        this.name = name;
    }
    public void callback(){
        System.out.println("Ok, I will visit " + name);
    }
}
public class storecustomer {
    public static void main(String[] args){
        store str = new store();
        Customer c1 = new Customer("Osayd");
        Customer c2 = new Customer("Tamim");
        str.register(c1);
        str.register(c2);
        str.inviteSale();
    }
}