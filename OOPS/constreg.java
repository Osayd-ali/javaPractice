package OOPS;

class Rectangle_1{
    private double length;
    private double breadth;
    public Rectangle_1(){ //1st constructor which doesnt take any parameters, pre assigning object properties without taking arguments.
        length = 1;
        breadth = 1;
    }
    public Rectangle_1(double l, double b){
        length = l;
        breadth = b;
    }
    public Rectangle_1(double s){
        length = breadth = s;
    }
    public double area(){
        return length * breadth;
    }
    public double perimeter(){
        return 2 * (length + breadth);
    }
    public boolean isSquare(){
        return length == breadth;
    }
}
public class constreg {
    public static void main(String args[]){
        Rectangle_1 rec1 = new Rectangle_1();
        Rectangle_1 rec2 = new Rectangle_1(5,6);
        Rectangle_1 rec3 = new Rectangle_1(4,4);
        System.out.println(rec1.area());
        System.out.println(rec2.area());
        System.out.println(rec3.isSquare());
    }
}