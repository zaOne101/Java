package com.company.chapter2;

import java.util.Scanner;

public class NumberOfYears {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");

        int minutes = input.nextInt();

        int hours = minutes / 60  ;
        int days = hours / 24;
        int totalYears = days / 365;
        int remainingDays = days % 365;

        System.out.println(minutes + " minutes is approximately " + totalYears + " years and " + remainingDays + " days");

    }
}
