/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab4.circle;

/**
 *
 * @author satyanagasaitejaadabala
 */
public class circle {
    
   private double radius;
   private final double PI = 3.14159;
  
   circle(double radius){
       setRadius(radius);
   }
  
   circle(){
       setRadius(0.0);
   }
  
   void setRadius(double radius){
       this.radius = radius;
   }
  
   double getRadius(){
       return this.radius;
   }
  
   double getArea(){
       return PI * radius * radius;
   }
  
   double getDiameter(){
       return radius * 2;
   }
  
   double getCircumference(){
       return 2 * PI * radius;
   }
}
