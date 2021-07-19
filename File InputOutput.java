package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileInputOutputAssignment {
    public static void main(String[] args){
        // Create an object of class file
        File myFile = new File("/home/kibe/IdeaProjects/Test/myFile.txt");

        try {
            //Check if file has been created
            if ( myFile.createNewFile() ){
                System.out.println("File created: " + myFile.getName() );
            }else {
                System.out.println("File already exists!");
            }

            // Write to the file
            // Create an object of class FileWriter
            FileWriter writer = new FileWriter("/home/kibe/IdeaProjects/Test/myFile.txt");

            // Use write() // close()
            writer.write("I'm Chebon Kibet Kelvin\n");

            // Close
            writer.close();

            // Reading a file
            // create an object of class scanner
            Scanner reading = new Scanner(myFile);// Use name of the file class object

            while ( reading.hasNextLine() ){
                String data = reading.nextLine();
                System.out.println(data);
            }
            reading.close();
        } catch ( IOException exception){
            System.out.println("An error occurred!");
        }
    }
}

