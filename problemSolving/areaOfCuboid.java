import java.lang.*;
import java.util.*;

public class areaOfCuboid {
    public static void main(String args[])
    {
       int l, b, h, volume, total_area;
       Scanner s = new Scanner(System.in);
       System.out.println("Enter values for l, b and h: ");
       l = s.nextInt();
       b = s.nextInt();
       h = s.nextInt();
       volume = l * b * h;
       total_area = 2*((l*b)+(b*h)+(h*l));
       System.out.println("The volume of cuboid is: " + volume + "\nThe total area of cuboid is: " + total_area);
    }
}
