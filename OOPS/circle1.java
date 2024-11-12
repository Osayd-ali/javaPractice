package OOPS;

 class Circle {
        public double radius;
        public double area(){
            return Math.PI * radius * radius;
        }
        public double circumference(){
            return 2 * Math.PI * radius;
        }
 }

public class circle1 {
    public static void main(String args[]){
        Circle c1 = new Circle();
        c1.radius = 4;
        System.out.println(c1.area());
        System.out.println(c1.circumference());
    }
}