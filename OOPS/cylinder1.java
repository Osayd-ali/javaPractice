package OOPS;

class Cylinder {
    public double radius;
    public double height;
    public double lidArea(){
        return Math.PI * radius * radius;
    }
    public double totalSurfaceArea(){
        return 2*lidArea() + circumference() * height;
    }
    public double circumference(){
        return 2*Math.PI*radius;
    }
    public double volume(){
        return lidArea()*height;
    }
}
public class cylinder1 {
    public static void main(String args[]){
        Cylinder cyl1 = new Cylinder();
        cyl1.height = 10;
        cyl1.radius = 4;
        System.out.println("Lid area is: " + cyl1.lidArea());
        System.out.println("Total surface area is: " + cyl1.totalSurfaceArea());
        System.out.println("Circumference  is: " + cyl1.circumference());
        System.out.println("Volume is: " + cyl1.volume());
    }
}