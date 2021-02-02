package com.company.uniques;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your First Side: ");
        double side1 = sc.nextDouble();

        System.out.println("Enter Your Second Side: ");
        double side2 = sc.nextDouble();

        System.out.println("Enter Your Third Side: ");
        double side3 = sc.nextDouble();

        double p = (side1+side2+side3)/2;

        double areaOfTriangle = Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));

        System.out.println("Area of Triangle is: "+areaOfTriangle);
    }
}
