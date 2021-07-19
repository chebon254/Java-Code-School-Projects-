package com.company;

import java.util.Scanner;

public class area_circle {
    public static void main(String[] args){
        // Write Your code here

        Scanner area_of_circle = new Scanner(System.in);

        // Prompt user
        System.out.println("Enter the radius of the circle: ");

        // Variable
        double radius;

        // Get Input from User
        radius = area_of_circle.nextDouble();

        // Calculate Area
        double area = (22*radius*radius)/7;

        // Print out the answer
        System.out.println("The Area of the circle is: " + area);

    }
}

