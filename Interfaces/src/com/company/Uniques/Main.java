package com.company.Uniques;

/*
 * interface I_Interface_name{
 *   //constants
 *   public static final type constant_name = value;
 *
 *   //methods
 *   public method(parameters);
 * } */
public class Main {
	public static void main(String[] args) {
		Sparrow sparrow = new Sparrow();
		sparrow.fly();
		
		Plane plane = new Plane();
		plane.fly();
	}
}

interface IFlyable{
	public void fly();
}
class Sparrow implements IFlyable{
	
	@Override
	public void fly() {
		System.out.println("Sparrow is Flying at a speed of 10");
	}
}

class Plane implements IFlyable{
	@Override
	public void fly() {
		System.out.println("Plane is flying at a speed of 2000");
	}
}