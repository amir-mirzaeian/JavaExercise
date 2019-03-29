package com.amir.java.exercise;

/*
Write a program called SumAverageRunningInt to produce the sum of 1, 2, 3, ..., to 100. Store 1 and 100
in variables lowerbound and upperbound, so that we can change their values easily.
 Also compute and display the average.
 */

public class SumAverageRunningInt {

    public static void main(String[] args) {

        int lowerBound = 1;
        int upperBound = 100;
        int sum =0;

        for (int i = lowerBound; i <= upperBound; i++){
            sum += i;
        }

        float avg =(float)sum / 100;
        System.out.println("Sum:" +sum + ", average:" + avg);
    }
}
