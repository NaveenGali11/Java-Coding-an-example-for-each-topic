package com.company.Uniques;

/*
 * Abstract Classes and Methods Syntax
 * abstract class parent_class{
 *       //abstract method
 *       return_type abstract method_name(parameters);
 * }
 * class child_class extends parent_class{
 *   //override abstract method
 *   @Override(optional)
 *   return_type method_name(parameters){
 *       //body
 * }
 * } */
public class Main {
    public static void main (String[] args) {
      Coupe coupe = new Coupe();
      coupe.Drive();

      Alto alto  = new Alto();
      alto.Drive();
      alto.Drive(11);
    }
}

abstract class Car{
    //an abstract method doesn't have a body
    public abstract void Drive();
}
class Coupe extends Car{
    @Override
    public void Drive() {
        System.out.println("Driving Fast...");
    }
}
class Alto extends Car{

    @Override
    public void Drive() {
        System.out.println("Driving Slow...");
    }
    public void Drive(int Speed){
        System.out.println("Driving at a Speed of "+Speed+" Mph");
    }
}