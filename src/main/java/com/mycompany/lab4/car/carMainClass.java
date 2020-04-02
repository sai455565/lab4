/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab4.car;

/**
 *
 * @author satyanagasaitejaadabala
 */
public class carMainClass {
    public static void main(String[] args) {
        carClass aCar = new carClass(2020, "Rolls Royce");
        
        // display the car's model and make
       System.out.println("Year of the car: " + aCar.getYear());
       System.out.println("Make of the car: " + aCar.getMake());
       System.out.println();
      
       // call the accelerate method five times and
       // get the current speed of the car and display it each time
       for(int i = 0; i < 5; i++)
       {
           aCar.accelerate();
           System.out.println("Current speed of the car: " + aCar.getSpeed());
       }
      
       // call the brake method five times and
       // get the current speed of the car and display it each time
       for(int i = 0; i < 5; i++)
       {
           aCar.brake();
           System.out.println("Current speed of the car: " + aCar.getSpeed());
       }
    }
   
}
