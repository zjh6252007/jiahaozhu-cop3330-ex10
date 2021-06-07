/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 jiahao zhu
 */

import java.util.Scanner;

public class checkout {
    public static void main(String[] args) {
        final double taxRate = 0.055;
        int itemprice = 0;
        int quantity = 0;
        double totalPrice = 0,tax = 0;
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < 3; i++)
        {
            System.out.println("Enter the price of item" + (i+1) +":");
            itemprice = scan.nextInt();
            System.out.println("Enter the quantity of item" + (i+1) +":");
            quantity = scan.nextInt();
            totalPrice +=(itemprice * quantity);
        }
        tax = taxRate * totalPrice;
        System.out.println("Subtotal: " + totalPrice);
        totalPrice += tax;
        System.out.println("Tax: " + tax);
        System.out.println("Total: " + totalPrice);


    }
}
