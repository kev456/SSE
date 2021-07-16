package com.ss.jb.five;

// Purpose of this assignment is to take an array of integers and see if they can sum up to a goal number

public class Recursion {

    public static boolean groupSumClump(int initial, int[] numbers, int goal) {
        
        // If statement to see if initial position exceeds the length of the array
        if (initial >= numbers.length) {
            return goal == 0;
        }

        // Initial variable
        int i = 1;
        
        // While statement to look for adjacent duplicate numbers in the array
        while (initial + i < numbers.length && numbers[initial] == numbers[initial + i]) {
            i++;
        }

        // If statements to see if the numbers in the array add up to the goal
        if (groupSumClump(initial + i, numbers, goal - i * numbers[initial])) {
            return true;
        }
        if (groupSumClump(initial + i, numbers, goal)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        // Testing the method to see if it works
        int[] x = new int[] {2, 4, 8};
        int[] y = new int[]{1, 2, 4, 8, 1};
        int[] z = new int[] {2, 4, 4, 8};
        System.out.println(groupSumClump(0, x, 10));
        System.out.println(groupSumClump(0, y, 14));
        System.out.println(groupSumClump(0, z, 14));
    }
}
