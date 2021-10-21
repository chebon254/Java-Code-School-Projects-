package com.company;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList<Integer> list = new LinkedList();

        list.add(0, 5);
        list.add(1, 4);
        list.add(2, 21);
        list.add(3, 32);
        list.add(4, 2);
        list.add(5, 211);
        list.add(6, 343);
        list.add(7, 65);

        list.remove(5);
        list.remove(6);


        System.out.println("Linked list: \n" + list);
        System.out.println("Index:\n" + list.get(2));


        LinkedList<String> names = new LinkedList();
        // Add Names
        names.add(0, "Chebon Kibet");
        names.add(1, "Alan Kiprop");
        names.add(2, "Collins Kip");
        names.add(3, "Komen Dancun");
        names.add(4, "Lulu Hassan");

        for(String name:names){
            System.out.println("Name: " + name);
        }
        System.out.println("Here are my family: \n" + names);

    }
}
