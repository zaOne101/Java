package com.company.chapter2;

import java.util.Scanner;

public class ConvertFeetIntoMeters {
    public static void main(String[] args) {

        // Declaration of input reader
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a value for feet: ");
        double feet = input.nextDouble();

        double meters = feet * 0.305;

        System.out.println( feet + " feet is " + meters + " meters");
    }
}
