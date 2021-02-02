package com.company.uniques;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dog dog = new Dog("Doggy");
        System.out.println(dog.name);
    }
}

class Animal{
    String name;

    //constructor
    Animal(String name) {
        this.name = name;
    }
}

//Child Class
class Dog extends Animal{

    //parent constructor has
    //'name' param so we need
    //to pass it through here
    //to the 'super' method
    Dog(String name) {
        //Super is a normal method
        //call so it takes 'name' as
        //an argument
        super(name);
    }
}