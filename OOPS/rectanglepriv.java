package OOPS;

class Rectangle_ {
    private double length;
    private double breadth;
    public double getLength(){
        return length;
    }
    public double getBreadth(){
        return breadth;
    }
    public void setLength(double l){
        if(l>=0){
            length = l;
        }
        else {
            length = 0;
        }
    }
    public void setBreadth(double b){
        if(b>=0){
            breadth = b;
        }
        else {
            length = 0;
        }
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

public class rectanglepriv {
    public static void main(String args[]){
        Rectangle_ rec1 = new Rectangle_();
        rec1.setLength(8);
        rec1.setBreadth(9);
        System.out.println("Area of rectangle is: " + rec1.area());
        System.out.println("Perimeter of rectangle is: " + rec1.perimeter());
        System.out.println("Is it a square? " + rec1.isSquare());
        System.out.println("Length: " + rec1.getLength());
        System.out.println("Breadth: " + rec1.getBreadth());
    }
}