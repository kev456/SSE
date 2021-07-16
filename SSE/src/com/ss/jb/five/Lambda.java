package com.ss.jb.five;

import java.util.Scanner;

// Purpose of this assignment is to practice lambda expressions and take user input to find if their number is odd/even, prime/composite, or palindrome/not


// Creates interface for PerformaOperation
interface PerformOperation {
    boolean check(int x);
}

public class Lambda {
    
    // Boolean method to do interface operations
    boolean checker(PerformOperation po, int num) {
        return po.check(num);
    }
    
    // Finds if the number is odd or even
    public static PerformOperation isOdd() {
        return (int x) -> x % 2 == 1;
    }
    
    // Finds if the number is prime or composite
    public static PerformOperation isPrime() {
        return (int x) -> {
            if(x<3) {
            return true;
        }
        if((x % 2)==0) {
            return false;
        }
        for(int i=3;i<Math.sqrt(x);i+=2) {
            if((x % i)==0) {
                return false;
            }
        }
        return true;};
    }
    
    // Finds if the number is a palindrome or not
    public static PerformOperation isPalindrome() {
        return (int x) -> Integer.toString(x).equals(new StringBuilder(Integer.toString(x)).reverse().toString());
    }
    
    public static void main(String[] args) {
        
        // Initial variables
        PerformOperation op;
        boolean resp = false;
        String ans = null;
        
        // Takes user input to see how many numbers have to be identified
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of test cases: ");
        int val = input.nextInt();
        
        // Asks user to input the condition and the number to be checked
        System.out.println("Enter condition\n(1: odd/even\n2: prime \n3: palindrome) \nthen the number to test: ");
        
        // While statement to continue until the number of test cases is complete
        while (val-- > 0) {
            // Takes each line user inputs and puts it into a 
            String line = input.nextLine();
            
            String[] result = line.split(" ");
            
            int cond = input.nextInt();
            int num = input.nextInt();
            
            // If/else statements for each condition
            if(cond == 1){
                    op = Lambda.isOdd();
                    resp = op.check(num);
                    
                    ans = (resp)? " ODD" : " EVEN";
            } else if(cond == 2){
                    op = Lambda.isPrime();
                    resp = op.check(num);
                    
                    ans = (resp)? " PRIME": " COMPOSITE";
            } else if (cond == 3){
                    op = Lambda.isPalindrome();
                    resp = op.check(num);
                    
                    ans = (resp)? " PALINDROME": " NOT PALINDROME";
            }
            
            System.out.println(ans);
            }
        }  
        
    }
