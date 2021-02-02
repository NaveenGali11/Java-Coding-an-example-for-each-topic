package com.company.uniques;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("====For Loop====");

        for (int i=0;i<5;i++){
            System.out.println("Counter: "+i);
        }

        // Infinite Loop
        //for (;;){
        //
        //}

        System.out.println("====For Loop | Comma usage Example ====");
        for (int i=0,j=10;i<j;i++,j--){
            System.out.println("Counters: i= "+i+" j= "+j);
        }
    }
}
