package com.ss.jb.five;

import java.util.ArrayList;
import java.util.stream.Collectors;

//Purpose of this assignment is to add identifiers to each given number in the array list

public class EvenOrOdd {

    // Method for adding even or odd identifiers to each number and concating into one line
    public static String getString(ArrayList<Integer> numbers) {
        return numbers.stream().map(x -> x % 2 == 0 ? "e" + x : "o" + x).collect(Collectors.joining(", "));
    }

    public static void main(String[] args) {
        
        // Initial array list
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(3);
        numbers.add(44);
        numbers.add(10);
        numbers.add(13);
        
        String values = getString(numbers);
        System.out.println(values);
    }
}
