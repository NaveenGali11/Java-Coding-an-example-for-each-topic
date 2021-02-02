package com.company.uniques;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(Math.PI);
        System.out.println(Math.max(3,5));
        System.out.println(Math.min(3,5));
        System.out.println(Math.sqrt(4));

        int absoluteValue = Math.abs(-5);
        System.out.println(absoluteValue);

        System.out.println(0/0.0);
        System.out.println((0/0.0)+5);

        System.out.println(5/0.0);
        System.out.println(-5/0.0);

        System.out.println(Math.round(20.0/3.0));
        System.out.println(Math.round(20.0*100.0/3.0)*100);

        System.out.println(Math.random());
        System.out.println((int)(Math.random()*100));
        System.out.println((int)(Math.random()*100)+100);
    }
}
