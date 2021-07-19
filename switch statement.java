package com.company;

import java.util.Scanner;

public class assignment_switch_statement {
    public static void main(String[] args){
        int a, b, max, grade;
        String choice;

        // Object of Scanner class
        Scanner input = new Scanner(System.in);

        // Do while loop
        do {
            // Display the menu of function
            System.out.println("Option\t Know your status on \n1\t Eligibility to vote?\n2\t Maximum integer\n3\t Your grade\n4\t Name 6x\n5\t Even Numbers");

            // Select from the menu
            System.out.println("Choose an option from the menu - type 1, 2 or 3");

            // Get user option
            int option = input.nextInt();

            /* Switch statement */
            switch (option) {
                // Case 1 or option one
                case 1:
                    // Declare Variable
                    String name;
                    int age;
                    // Prompt user for their name
                    System.out.println("Enter your name: ");


                    // Capture Name Input From User
                    name = input.next();


                    // Prompt User for their age
                    System.out.println("Enter Your age: ");

                    // Capture Input
                    age = input.nextInt();

                    // Get eligibility according to age input
                    if (age >= 18) {
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
                    System.out.println("Maximum Integer is: " + max);
                    break;
                case 3:
                    // Prompt user
                    System.out.println("Enter Your Grade");

                    // Get input
                    grade = input.nextInt();

                    // Grade user According to their Input
                    // 81 to 100 A
                    if (grade >= 81 && grade <= 100) {
                        System.out.println("You have an \"A\"");
                    }

                    // 61 to 80 B
                    else if (grade >= 61 && grade < 81) {
                        System.out.println("You have a \"B\"");
                    }

                    // 41 to 60 C
                    else if (grade >= 41 && grade < 61) {
                        System.out.println("You have a \"C\"");
                    }

                    // 0 to 40 F
                    else if (grade >= 0 && grade < 41) {
                        System.out.println("You have a \"F\"");
                    }

                    // Any Number not between 0 to 100 is invalid input
                    // Tell User That their input is invalid
                    else {
                        System.out.println("Invalid Input!!!");
                    }
                    break;
                case 4:
                    // Declare variables
                    int i = 1;

                    // While loop
                    while (i <= 6) {
                        System.out.println(i + "\tChebon Kibet");
                        // Calculate
                        i++;
                    }

                    break;
                case 5:
                    // For loop

                    // Variable
                    int even;

                    // For loop
                    for (even = 2; even <= 400; even = even + 2) {
                        System.out.println(even + "");
                    }
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
            System.out.println("Do you want to choose again?\t Yes\t No");
            choice = input.next();
        }while ( choice.equalsIgnoreCase("Yes") );
    }
}

