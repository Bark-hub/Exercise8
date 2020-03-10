package com.company;

import java.util.Scanner;

public class Collection {
    public static Scanner input = new Scanner(System.in);

    public void display(){
        System.out.println("\nThis is a Person");
    }

    public void add(){
        for (int i = 0; i< 2; i++) {
            System.out.println("----Adding a Person----");
            System.out.print("Enter a name: ");
            String name = input.nextLine();
            System.out.print("Enter an email: ");
            String email = input.nextLine();
            System.out.println("");
            Contact collection1 = new Contact(name, email);
            Main.collection[i] = collection1;
        }

    }

    // Above is the add method structure and below is the test method.
    public void test(){
        for (Collection collection1 : Main.collection){
            collection1.display();
        }
    }

    //the test method is actually a function for displaying the individual objects within the array.
}
