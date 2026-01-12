/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.lang.*;
import java.util.*;

import static java.lang.Math.sqrt;

/**
 *
 * @author mirhamedali
 */
public class Rootsofqeqn {
    public static void main(String args[])
    {
        int a, b, c;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the values for a, b and c: ");
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        double r1, r2;
        r1 = (-b + (sqrt((b*b)-4*a*c)))/(2*a);
        r2 = (-b - (sqrt((b*b)-4*a*c)))/(2*a);
        System.out.println("Positive root is: " + r1);
        System.out.println("Negative root is: " + r2);
    }
}
