package com.company;

import java.util.Scanner;

public class TwoDimensionalArrayAssignment {
    public static void main(String[] args){
        // Write Code Here

        // Two Dimensional Array & Its name
        int [][] twoDimension = new int[4][2];

        // Object class Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user
        System.out.println("Enter the 4 Values: ");

        // Declare variables 1st get the row
        for (int row = 0; row<4; row++){
            // Column
            for ( int col = 0; col<1; col++ ){
                // Position 0 for each column should be
                twoDimension[row][0] = input.nextInt();

                // Position 1 for each column should be
                twoDimension[row][1] = twoDimension[row][0] * twoDimension[row][0];
            }
        }
        // Guide Text
        System.out.print("Output");

        // Declare variables Display the array list
        for (int[] row : twoDimension){
            for ( int col : row ){
                System.out.print( col + " ");
            }
        }
    }
}
