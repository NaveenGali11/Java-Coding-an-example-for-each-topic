package com.company.uniques;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("====For Each Loop====");
        int[] arr = {1,2,3};
        int sum = 0;
        for (int number : arr) {
            sum += number;
            System.out.println("Number: "+number);
        }
        System.out.println("Sum: "+sum);

    }
}
