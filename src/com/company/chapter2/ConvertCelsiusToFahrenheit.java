package com.company.chapter2;

import java.util.Scanner;

public class ConvertCelsiusToFahrenheit {

    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a degree in Celsius: ");
        int celsius = input.nextInt();
        double tempInFahrenheit = (9.0 / 5 ) * celsius + 32 ;

        // Display the results
        System.out.println(celsius + " Celsius is " + tempInFahrenheit + " Fahrenheit");
    }
}