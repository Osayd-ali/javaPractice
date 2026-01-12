package OOPS;

class Product {
    private String item_no;
    private String name;
    private double price;
    private int qty;
    public String getItem_no(){
        return item_no;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getQty(){
        return qty;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setQty(int qty){
        this.qty = qty;
    }
    public Product(String item_no, String name, double price, int qty){
        this.item_no = item_no;
        this.name = name;
        setPrice(price);
        setQty(qty);
    }
}
class Customer{
    private String custid;
    private String cus_name;
    private String address;
    private String phno;
    public Customer(String custid, String cus_name){
        this.custid = custid;
        this.cus_name = cus_name;
    }
    public Customer(String custid, String cus_name, String address, String phno){
        this.custid = custid;
        this.cus_name = cus_name;
        setAddress(address);
        setPhno(phno);
    }
    public String getCustid(){
        return custid;
    }
    public String getCus_name(){
        return cus_name;
    }
    public String getAddress(){
        return address;
    }
    public String getPhno(){
        return phno;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setPhno(String phno){
        this.phno = phno;
    }
}

public class prod1cus1 {
    public static void main(String args[]){
        Product p1 = new Product("A-2258", "Apple Pencil", 100.00,10);
        System.out.println("Product details: " + "\n" + "Item name: " + p1.getName() + "\n" + "Item_no: " + p1.getItem_no() + "\n" + "Price: " + p1.getPrice() + "\n" + "Available Qty: "+ p1.getQty());
        Customer c1 = new Customer("2185291","Osayd", "500 E 33rd St","7022445566");
        System.out.println("Customer details: "+"\n"+"Customer ID: "+c1.getCustid()+"\n" +"Customer name: "+ c1.getCus_name() + "\n"+"Address: "+c1.getAddress() +"\n"+ "Ph No: " + c1.getPhno());
    }
}