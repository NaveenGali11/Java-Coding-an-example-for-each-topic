package com.company.uniques;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int amountOfMoneyOnAccount = 100;
        int itemPrice = 200;

        if (amountOfMoneyOnAccount < itemPrice) {
            System.out.println("You don't have enough money on you account to purchase "+"this item.");
        }else{
            System.out.println("Item is Purchased");
        }
         // Nested If Statement

        int i1 = 3;
        int i2 = 2;
        int i3 = 10;
        if (i1 > i2){
            if (i1>i3){
                System.out.println("i1 is more than i2 and i3");
            }else{
                System.out.println("i1 is more than i2 but less than i3");
            }
        }

        //if - else - if statements

        int orderprice = 1000;
        if (orderprice > 0 && orderprice < 100){
            System.out.println("You have 5% Discount for this order");
        }else if (orderprice >= 100 && orderprice < 500){
            System.out.println("You have 10% discount on thi order");
        }else if (orderprice >= 500 && orderprice < 5000){
            System.out.println("You have 15% discout on this order");
        }
    }
}
