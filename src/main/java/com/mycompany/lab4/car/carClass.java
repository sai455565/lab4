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
public class carClass {
    
    public int      year;
    public String   make;
    public int      speed;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    
    public void accelerate(){
        speed += 5;
    }
    
    public void brake(){
        speed -= 5;
    }
    
    public carClass(int newYearModel, String newMake){
       year = newYearModel;
       make = newMake;  
       speed = 0;
   }

}


