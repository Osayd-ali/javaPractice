package OOPS;

class Rectangle {
    public double length;
    public double breadth;
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

public class rectangle1 {
    public static void main(String args[]){
        Rectangle rec1 = new Rectangle();
        rec1.length = 8;
        rec1.breadth = 9;
        System.out.println("Area of rectangle is: " + rec1.area());
        System.out.println("Perimeter of rectangle is: " + rec1.perimeter());
        System.out.println("Is it a square? " + rec1.isSquare());
    }
}