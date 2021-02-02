package com.company.uniques;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("====String Comparision====");
        System.out.println();

        String s = " hello ";
        String s2 = " hello ";
        System.out.println("s==s2:  "+(s == s2));

        String s3 = new String(" hello ");
        System.out.println("s == s3: "+(s == s3));
        System.out.println("s.equals(s3): "+(s.equals(s3)));
        System.out.println("s == s3.intern(): "+(s == s3.intern()));

        String firstName = "Naveen";
        String firstName2 = "naveen";
        System.out.println("firstname.equals(firstName2): "+firstName.equals(firstName2));
        System.out.println("firstname.equalsIgnoreCase(firstName2): "+firstName.equalsIgnoreCase(firstName2));

    }
}
