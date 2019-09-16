package com.company.chapter2;

import java.util.Scanner;

public class CalculateTips {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the subtotal and gratuity rate: ");
    double subtotal = input.nextDouble();
    double gratuityRate = input.nextDouble();

    double gratuity = gratuityRate / 100 * subtotal;
    double total = subtotal + gratuity;

    System.out.println("The gratuity is $" + gratuity + " and the total is $" + total);
    }

}
