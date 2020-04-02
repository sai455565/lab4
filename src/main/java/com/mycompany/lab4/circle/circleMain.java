/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab4.circle;

import java.util.Scanner;

/**
 *
 * @author satyanagasaitejaadabala
 */
public class circleMain {
    
    public static void main(String args[]){
       Scanner in = new Scanner(System.in);
       System.out.print("Enter radius of the circle: ");
       double radius = in.nextDouble();   // taking radius of circle as input
       circle circle = new circle(radius);   // creating a circle object
       System.out.println("================================================");
       System.out.println("Radius of the circle is " + circle.getRadius());
       //    printing radius of circle using accessor method
       System.out.println("Area of the circle is " + circle.getArea());
       //   printing area of the circle
       System.out.println("Diameter of the circle is " + circle.getDiameter());
       //   printing diameter of the circle
       System.out.println("Circumference of the circle is " + circle.getCircumference());
       //   printing circumference of the circle
       System.out.println("================================================");
    }
}
