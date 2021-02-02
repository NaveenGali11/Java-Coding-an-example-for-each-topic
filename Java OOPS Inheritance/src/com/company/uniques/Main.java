package com.company.uniques;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Dog Class Initiation");
        Dog dog = new Dog();
        dog.move();
        dog.growl();

        System.out.println("Duck Class Initiation");
        Duck duck = new Duck();
        duck.quack();
        duck.move();
    }
}
// Parent Class
class Animal{
    public void move(){
        System.out.println("Animal parent class. Move....");
    }
}
// Child Class
class Dog extends Animal{
    public void growl(){
        System.out.println("Dog Child class.A dog can growl,but a duck can't.Grr.....");
    }
}
//Child Class
class Duck extends Animal{
    public void quack(){
        System.out.println("Duck child class.A duck can quack,but a dog can't.Quack...");
    }
}
