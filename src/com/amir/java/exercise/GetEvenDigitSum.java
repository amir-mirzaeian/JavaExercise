package com.amir.java.exercise;

public class GetEvenDigitSum {

    public static void main(String[] args) {
        int number = 231;
        int sum = 0;
        int temp = 0;
        if (number < 0)
            System.exit(-1);
        while (number > 10) {

            temp = number % 10;
            //System.out.println("temp= "+ temp);
            if (temp % 2 == 0) {

                sum += temp;
            }
            number /= 10;
        }
        if (number % 2 == 0) {
            sum += number;
        }
        System.out.println("Sum:" + sum);
    }

}
