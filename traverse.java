package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myArray[] = {1,3,5,7,8};
        System.out.print("The original array elements are :\n");
        for(int i = 0; i<myArray.length; i++) {
            System.out.printf("myArray[%d] = %d \n", i, myArray[i]);
        }
    }
}
