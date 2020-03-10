package com.company;

import java.util.*;

//Mubarik Abdi 3/8/2020

public class Main {

    public static Collection[] collection = new Collection[]{ new Contact(), new BusinessContact()};
    // Above I used an array to collect the objects made from the contact class and business class
    // I do not enjoy arrays

    public static void main(String[] args) {

        /*
        Contact contact1 = new Contact("jeffree", "goldstar");
        BusinessContact business1 = new BusinessContact("614-319-3159");
        collection[0] = contact1;
        collection[1] = business1;
        */
        // Above is a set of objects I made for testing purposes. Please Ignore.

        // Below is the add and test methods which resonate from the Collection class.
        collection[0].add();
        collection[0].test();

    }
}
