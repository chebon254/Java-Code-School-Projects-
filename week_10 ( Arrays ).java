package com.company;

import java.util.Scanner;
import java.util.Arrays;


public class Arrays_Assignment {
    public static void main(String[] args) {
        // Write Your Code Here

        // Object class Scanner
        Scanner input = new Scanner(System.in);

        // Array
        double [] numArray = new double[15];
        System.out.println("Kindly type 15 double values:");

        // Variable
        int numTimes = 0;

        // While loop to calculate number of times user inputs a value and ensure it is under 16
        while ( numTimes<numArray.length ){
            numArray[numTimes] = input.nextDouble();
            numArray[3] = 3.5;
            numArray[8] = numArray[5] + numArray[12];
            numTimes++;
        }
        double ten = numArray[9];

        System.out.println("The tenth Element is: " + ten);

        System.out.print( "The 3rd element is: " + numArray[3] + "\n\n" );


        // For loop
        System.out.println("Using For Loop");
        for (int i = 0, myArrLength = numArray.length; i < myArrLength; i++) {
            double num = numArray[i];
            System.out.print( num + " ");
        }



        //  For each loop
        System.out.println("\n\nUsing for Each");

        for (double num : numArray) {
            System.out.print(num + " ");
        }


        // Sum of Elements
        double sum = 0;
        for (double number: numArray){
            sum += number;
        }
        System.out.println("The sum of all elements is: " + sum);
    }
}

