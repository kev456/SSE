package com.ss.jb.five;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Purpose of this assignment is to print out all the words in the array list that start with the letter a and is only 3 letters long

public class FindWords {

    // Method to find the words starting with a and a length of 3
    public static List<String> find(List<String> list) {
        return list.stream().filter(w -> w.startsWith("a")).filter(w -> w.length() == 3).collect(Collectors.toList());
    }

    public static void main(String[] args) {

        // Initial array list
        ArrayList<String> words = new ArrayList<String>();
        words.add("cat");
        words.add("add");
        words.add("java");
        words.add("ant");
        words.add("apple");
        
        // Shows the full array list and the array list with length 3 and starts with a
        System.out.println(words);
        System.out.println(find(words));
        
    }

}
