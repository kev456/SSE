package com.ss.jb.five;

import java.util.*;

// Purpose of this assignment is to practice basic lambda expressions

public class BasicLambdas {
    
    // Method to print out the String array
    public static void printArray(String[] words) {
        for(int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }

    // Static method to do assignment 5
    public static int findEFirstV2(String s1, String s2) {
        if (s1.toLowerCase().contains("e")) {
            return -1;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        String[] list = {"Java", "Basics", "Elephant", "Dog", "Python", "Electricity"};
        
        // Sort shortest to longest words
        Arrays.sort(list, (x, y) -> x.length() - y.length());
        System.out.println("Order By Shortest to Longest: ");
        printArray(list);
        
        // Sort longest to shortest words
        Arrays.sort(list, (x, y) -> y.length() - x.length());
        System.out.println("Order By Longest to Shortest: ");
        printArray(list);
        
        // Sort alphabetically
        Arrays.sort(list);
        System.out.println("Order By Alphabetical: ");
        printArray(list);
        
        // Sort by E words first then alphabetically
        Arrays.sort(list, (x, y) -> { if(x.toLowerCase().contains("e")) return -1; else return 1;});
        System.out.println("Order By E words First: ");
        printArray(list);
        
        // Using static method to sort by E words first then alphabetically
        Arrays.sort(list, (s1, s2) -> BasicLambdas.findEFirstV2(s1, s2));
        System.out.println("Order by E words using Static Method: ");
        printArray(list);
       

    }
    
}
