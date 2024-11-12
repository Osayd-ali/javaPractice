/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
import java.lang.*;

import static java.lang.Math.sqrt;


/**
 *
 * @author mirhamedali
 */
class Area
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        float a, b, c, S;
        System.out.println("Enter three sides a, b and c:  ");
        a = s.nextFloat();
        b = s.nextFloat();
        c = s.nextFloat();
        S = (a+b+c)/2;
        double area = sqrt(S*(S-a)*(S-b)*(S-c));
        System.out.println("Area of triangle is: " + area);
    }
}


