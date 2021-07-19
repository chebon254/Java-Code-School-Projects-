package com.company;

import java.util.Scanner;

public class methods_assignment {

    // Sum of two Integers
    static int getTotal(int y, int x){
        int total = y + x;
        return total;
    }

    // Even Number Methods
    static boolean isEven(int num){
        if ( num % 2 == 0 ){
            return true;
        } else {
            return false;
        }
    }
    // Square root Method
    static double getSquareroot(int numRoot){
        double sqrt = Math.sqrt(numRoot);
        return sqrt;
    }

    // Main Method
    public static void main(String[] args){
        // Object scanner class
        Scanner input = new Scanner(System.in);

        // =======================  Even Number True(Boolean) ==============================

        // Variable
        int num;

        // Prompt User
        System.out.println("Enter an integer");

        // Get input
        num = input.nextInt();

        System.out.println( isEven(num) + "");

        // =======================   Sum of Two Integers ==============================

        // Variable
        int y, x;

        // Prompt User
        System.out.println("Enter 1st integer: ");

        // Get input
         y = input.nextInt();

        // Prompt User
        System.out.println("Enter 2nd integer: ");

        // Get input
        x = input.nextInt();

        System.out.println( "The sum is " + getTotal(y, x) + "" );



        // =======================   Square Root ==============================

        // Variable
        int square_root;

        // Prompt user
        System.out.println("Enter a number to find its square root: ");

        // Get input
        square_root = input.nextInt();

        System.out.println("The Square root of " +square_root+ " is " + getSquareroot(square_root) );

    }

}

