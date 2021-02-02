package com.company.uniques;
public class Main {
    public static void main(String[] args){
        Car car = new Car();
        car.Drive();
        car.Drive(23);


        Coupe coupe = new Coupe();
        coupe.Drive();

        Alto alto = new Alto();
        alto.Drive();
    }
}

class Car{
    public void Drive(){
        System.out.println("Driving....");
    }

    public void Drive(int Speed){
        System.out.println("Car is being driven at "+Speed+" Mph");
    }
}

class Coupe extends Car{
    @Override
    public void Drive() {
        System.out.println("Driving Fast.....");
    }
}
class Alto extends Car{
    @Override
    public void Drive(){
        System.out.println("Driving Slow.....");
    }
}

