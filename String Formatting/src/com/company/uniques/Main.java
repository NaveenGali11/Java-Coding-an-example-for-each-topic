package com.company.uniques;

public class Main {

    public static void main(String[] args) {
	// write your code
        System.out.println("====String Formatting====");
        System.out.println();
        String firstName = "Naveen";

        String greetingsTemplate = "Hello,dear %s! Good %s!";

        String morning = "morning";
        String afternoon = "afternoon";
        String evening = "evening";
        String formattedString = String.format(greetingsTemplate,firstName,morning);
        System.out.println(formattedString);

        System.out.println(formattedString);

        System.out.printf("You have %d computers avaliable at store\n",10);
    }
}
