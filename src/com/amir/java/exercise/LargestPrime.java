package com.amir.java.exercise;

public class LargestPrime {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(12812721));
    }
    public static int getLargestPrime(int number){

        int largestPrime = 0;

        if (number <= 1) return -1;

        for (int  i = 2; i <= number; i++){

            if (number % i == 0){ //  i=2
                for (int j = 2 ; j <= i ; j++){
                    if (i == j){
                        largestPrime = i;
                    }else if (i % j == 0){
                        break;
                    }
                }
            }
        }
        return largestPrime;
    }

}
