package abstraction;

abstract class Shape{
    public abstract double perimeter();
    public abstract double area();
}
class Circle extends Shape{
    private int radius;
    public Circle(int radius){
        this.radius = radius;
    }
    public int getRadius(){ return radius;}
    public void setRadius(int radius){ this.radius = radius;}
    @Override
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    @Override
    public double area(){
        return Math.PI*radius*radius;
    }
}
class Rectangle extends Shape{
    private int length;
    private int breadth;
    public Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public int getLength(){ return length;}
    public int getBreadth(){ return breadth;}
    public void setLength(int length){ this.length = length;}
    public void setBreadth(int breadth) { this.breadth = breadth;}
    @Override
    public double perimeter(){
        return 2*(length + breadth);
    }
    @Override
    public double area(){
        return length*breadth;
    }
}
public class StudentChallenge {
    public static void main(String[] args){
        Circle c1 = new Circle(4);
        Rectangle r1 = new Rectangle(5,4);
        System.out.println("Circumference of circle is: " + c1.perimeter());
        System.out.println("Area of circle is: " + c1.area());
        System.out.println("Perimeter of rectangle is: " + r1.perimeter());
        System.out.println("Area of rectangle is: " + r1.area());
    }
}