package OOPS;

class Cylinder_ {
    private double radius;
    private double height;
    public double getRadius(){
        return radius;
    }
    public double getHeight(){
        return height;
    }
    public void setRadius(double r){
        radius = r;
    }
    public void setHeight(double h){
        height = h;
    }
    public Cylinder_(){
        setHeight(1);
        setRadius(1);
    }
    public Cylinder_(double r){
        setRadius(r);
        setHeight(1);
    }
    public Cylinder_(double r, double h){
        setRadius(r);
        setHeight(h);
    }
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
public class cylinderpriv {
    public static void main(String[] args){
        Cylinder_ cyl1 = new Cylinder_();
        Cylinder_ cyl2 = new Cylinder_(4);
        Cylinder_ cyl3 = new Cylinder_(4,5);
        System.out.println(cyl1.totalSurfaceArea());
        System.out.println(cyl2.totalSurfaceArea());
        System.out.println(cyl3.totalSurfaceArea());
    }
}