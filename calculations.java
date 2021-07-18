package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner in = new Scanner(System.in);
        // Get The Input 1st Integer
        System.out.print("Input 1st integer: ");
        // Input 1st integer
        int firstInt = in.nextInt();

        // Get The Input 2nd Integer
        System.out.print("Input 2nd integer: ");
        // Input 2nd Integer
        int secondInt = in.nextInt();

        // Print Sum of 1st & 2nd Integer
        System.out.printf("Sum: %d%n", firstInt + secondInt);

        // Print Difference of 1st & 2nd Integer
        System.out.printf("Difference: %d%n", firstInt - secondInt);

        // Print the product of 1st & 2nd Integer
        System.out.printf("Product: %d%n", firstInt * secondInt);

        // Print the Quotient of 1st & 2nd Integer
        System.out.printf("Quotient: %d%n", firstInt / secondInt);

        // Print the Remainder of 1st & 2nd Integer
        System.out.printf("Remainder: %d%n", firstInt % secondInt);

    }
}

