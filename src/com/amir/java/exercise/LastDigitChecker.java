package com.amir.java.exercise;

public class LastDigitChecker {
    public static void main(String[] args) {
        // write your code here
        System.out.println(hasSameLastDigit(89,99,999));
    }

    private static boolean hasSameLastDigit(int p1, int p2, int p3){

        int p1LastDigit = p1 % 10;
        int p2LastDigit = p2 % 10;
        int p3LastDigit = p3 % 10;

        if ((p1 <10 || p1 >1000) || (p2 <10 || p2 >1000) || (p3 <10 || p3 >1000))
            return false;
        else if(p1LastDigit == p2LastDigit || p1LastDigit == p3LastDigit || p2LastDigit == p3LastDigit)
            return true;
        else return false;


    }
}
