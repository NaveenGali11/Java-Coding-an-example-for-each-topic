package com.company.uniques;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("===User Activity Selection===");
        System.out.println("Please Select any one of the following: \nlogin,sign_up,terminate_program,main_menu,about_app:");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();

        switch (userInput){
            case "login":
                System.out.println("Please Enter your username and password");
                break;
            case "sign_up":
                System.out.println("Welcome!");
                break;
            case "terminate_program":
                System.out.println("Thank you! GoodBye");
                break;
            case "main_menu":
                System.out.println("Main menu");
                break;
            case "about_app":
                System.out.println("This app is created by me with "+"support of \u00AEIT-Bulls.com");
                break;
            default:
                System.out.println("Please, enter one of these values: login, "+"sign_up,terminate_program,main_menu,about_app");
                break;

        }
    }
}
