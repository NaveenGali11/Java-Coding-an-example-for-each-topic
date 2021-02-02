package com.company.Uniques;

/*
* final class class_name {
*       //Class Body
* } */
public class Main {
    public static void main(String[] args){
        Car car = new Car();
        car.Drive();
    }
}

final class Car{
    public void Drive(){
        System.out.println("Driving....");
    }
}