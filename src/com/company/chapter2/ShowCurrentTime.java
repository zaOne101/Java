package com.company.chapter2;

import java.util.Scanner;

public class ShowCurrentTime {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the timezone offset to GMT : ");
        int timezoneOffsetGmt = input.nextInt();

        long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds / 1000;

        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;

        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;

        long currentHour = totalHours % 60 + timezoneOffsetGmt;

        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT " + timezoneOffsetGmt);
    }
}
