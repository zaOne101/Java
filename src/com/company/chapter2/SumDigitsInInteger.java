package com.company.chapter2;

import java.util.Scanner;

public class SumDigitsInInteger {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000: ");

        int number = input.nextInt();

        int total = 0;
        int lastDigit = number % 10;
        total += lastDigit;
        number = number / 10;
        int secondLastDigit = number % 10;
        total += secondLastDigit;
        int firstDigit = number % 10;
        total += firstDigit;

        System.out.println("The sum of the digits is :" + total);
    }
}
