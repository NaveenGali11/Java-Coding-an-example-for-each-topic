package com.company.uniques;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String inputArguments = String.join(",",args);
        String adminFlag = "--admin";
        String guestFlag = "--guest";
        if (inputArguments.contains(adminFlag)&&inputArguments.contains(guestFlag)){
            System.out.println("Please Select either 'Admin' or "+"'Guest' mode for this program");
        }else if (inputArguments.contains(adminFlag)){
            System.out.println("Hello,Admin!");
        }else if (inputArguments.contains(guestFlag)){
            System.out.println("Hello,Guest!");
        }
    }
}
