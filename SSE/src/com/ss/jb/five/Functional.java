package com.ss.jb.five;

import static java.lang.Math.abs;
import java.util.ArrayList;
import java.util.List;

// Purpose of this assignment is to create methods that manipulate values in the array list

public class Functional{
    
    // Function to print the right most numbers in the array list
    public static List<Integer> rightDigit(List<Integer> numbers) {
        numbers.replaceAll(num -> abs(num) % 10);
        return numbers;
    }
    
    // Function to double all the numbers in the array list
    public static List<Integer> doubling(List<Integer> numbers) {
        numbers.replaceAll(num -> num * 2);
        return numbers;
    }
    
    // Function to remove all x in each string in the array list
    public static List<String> noX (List<String> words) {
        words.replaceAll(word -> word.replace("x", ""));
        return words;
    }
    
    // Examples of all functionals
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<Integer>();
        x.add(16);
        x.add(8);
        x.add(886);
        x.add(8);
        x.add(1);
        System.out.println(rightDigit(x));
        
        ArrayList<Integer> y = new ArrayList<Integer>();
        y.add(6);
        y.add(8);
        y.add(6);
        y.add(8);
        y.add(-1);
        System.out.println(doubling(y));
        
        ArrayList<String> z = new ArrayList<String>();
        z.add("xxax");
        z.add("xbxbx");
        z.add("xxcx");
        
        System.out.println(noX(z));
    }
    
}