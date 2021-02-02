package com.company.uniques;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //will use 'Animal' class
        //constructor and initialize
        //the 'name' property as "Unknown"
        Dog dog = new Dog();
        System.out.println(dog.name);
    }
}

class Animal{
    String name;

    //Constructor
    Animal(){
        this.name = "DogName";
    }
}

class Dog extends Animal{
    //empty child
    //constructor
    Dog(){
        //call 'super' to use
        //parent class constructor
        super();
    }
}
