package com.company;

import java.util.Scanner;

public class assignment_switch_statement {
    public static void main(String[] args){
        int a, b, max, grade;

        // Object of Scanner class
        Scanner input = new Scanner(System.in);

        // Display the menu of function
        System.out.println("Option\t Know your status on \n1\t Eligibility to vote?\n2\t Maximum integer\n3\t Your grade");

        // Select from the menu
        System.out.println("Choose an option from the menu - type 1, 2 or 3");

        // Get user option
        int option = input.nextInt();

        /* Switch statement */
        switch ( option ){
            // Case 1 or option one
            case 1:
                // Declare Variable
                String name;
                int age;
                // Prompt user for their name
                System.out.println("Enter your name: ");

                /**
                 * Hello madam there was an error and after googling it i found a solution that i should place an
                 * .nextLine() to consume the enter button/key and hence
                 * & hence calls for the next line
                 * Please address this issue in the next class.
                 */

                input.nextLine(); // This line you have to add (It consumes the \n character)

                // Capture Name Input From User
                name = input.nextLine();



                // Prompt User for their age
                System.out.println("Enter Your age: ");

                // Capture Input
                age = input.nextInt();

                // Get eligibility according to age input
                if ( age >= 18 ) {
                    System.out.println("Hurray!!! " + name + " you are eligible to vote.");
                }
                break;
            case 2:
                // Prompt user
                System.out.println("Enter 1st integer: ");

                // Get input
                a = input.nextInt();

                // Prompt user
                System.out.println("Enter 2nd integer: ");

                // Get input
                b = input.nextInt();

                max = (a >= b) ? a : b;
                System.out.println("Maximum Integer is: "+ max);
                break;
            case 3:
                // Prompt user
                System.out.println("Enter Your Grade");

                // Get input
                grade = input.nextInt();

                // Grade user According to their Input
                // 81 to 100 A
                if ( grade >= 81 && grade <=100 ){
                    System.out.println("You have an \"A\"");
                }

                // 61 to 80 B
                else if ( grade>=61 && grade <81 ){
                    System.out.println("You have a \"B\"");
                }

                // 41 to 60 C
                else if ( grade>=41 && grade <61 ){
                    System.out.println("You have a \"C\"");
                }

                // 0 to 40 F
                else if ( grade>=0 && grade <41 ){
                    System.out.println("You have a \"F\"");
                }

                // Any Number not between 0 to 100 is invalid input
                // Tell User That their input is invalid
                else {
                    System.out.println("Invalid Input!!!");
                }
                break;
            default:
                System.out.println("Invalid input");
                break;
        }

    }
}

