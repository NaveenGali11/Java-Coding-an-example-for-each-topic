package com.company.uniques;

public class Main {

    public static void main(String[] args) {
	// write your code here
        isOdd(23);
        isEven(44);

        boolean result = isEven(598);
            if (result){
                System.out.println("Number returned is even");
            }
    }

    public static void isOdd(int num){
        if (num % 2 == 0){
            System.out.println(num + "is an even number");
        }else {
            System.out.println(num + "is an odd number");
        }
    }

    public static boolean isEven(int num){
        if (num % 2 == 0){
            return true;
        }
        return false;
    }
}
