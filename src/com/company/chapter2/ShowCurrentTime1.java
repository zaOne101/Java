package com.company.chapter2;

import java.util.Scanner;

public class ShowCurrentTime1 {

    public static void main(String[] args) {
        // write your code here
        long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds / 1000;

        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;

        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;

        long currentHour = totalHours % 60;

        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + "GMT");
    }
}