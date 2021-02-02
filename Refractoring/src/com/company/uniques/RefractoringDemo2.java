package com.company.uniques;

public class RefractoringDemo2 {

    public static void main(String[] args) {
	// write your code here
        printToConsole();
    }

    private static void printToConsole() {
        int i = 0;
        System.out.println("Some Code that are not aligned");
        int sum = 10 + 5;
        System.out.println(sum);
        System.out.println(sum);
    }
}
