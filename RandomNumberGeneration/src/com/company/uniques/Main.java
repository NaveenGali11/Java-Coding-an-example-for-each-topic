package com.company.uniques;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("====Random Integer Generation====");
        Random r = new Random();
        System.out.println(r.nextInt());            //Any random number
        System.out.println(r.nextInt(100));  //Any integer from 0 to 99
        System.out.println(r.nextInt(100)+1);//Any integer from 1 to 100

        System.out.println("====Random Double Generator====");
        Random d = new Random();
        System.out.println(d.nextDouble());
    }
}
