package com.amir.java.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input:");

        try{

            int num = scanner.nextInt();

            if (num%2 == 0 ){
                System.out.println("The input is even");
            } else {
                System.out.println("The input is odd");
            }

        } catch (InputMismatchException e){
            System.out.println("You need to enter an integer. Bye");
            System.exit(-1);
        }

    }
    }

