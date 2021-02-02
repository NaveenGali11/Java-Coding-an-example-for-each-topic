package com.company.uniques;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Please,Enter any text: ");
        String userInput = sc.nextLine();
        System.out.println("You Entered These Words: ");
        System.out.println(Arrays.toString(userInput.split("[\\p{P}\\s]")));

    }
}
