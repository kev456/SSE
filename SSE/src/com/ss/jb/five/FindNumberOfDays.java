package com.ss.jb.five;

import java.util.ArrayList;
import java.util.Scanner;

// Purpose of this assignment is to find the number of days in each month from the given year

public class FindNumberOfDays {
        public static void main(String[] args) {
            
            // Array list filled with days for each month not on a leap year
            ArrayList<String> noLeap = new ArrayList<String>();
            noLeap.add("Jan-31"); 
            noLeap.add("Feb-28");
            noLeap.add("Mar-31");
            noLeap.add("Apr-30");
            noLeap.add("May-31");
            noLeap.add("Jun-30");
            noLeap.add("Jul-31");
            noLeap.add("Aug-31");
            noLeap.add("Sept-30");
            noLeap.add("Oct-31");
            noLeap.add("Nov-30");
            noLeap.add("Dec-31");
            
            // Array list filled with days for each month on a leap year
            ArrayList<String> yesLeap = new ArrayList<String>();
            yesLeap.add("Jan-31"); 
            yesLeap.add("Feb-29");
            yesLeap.add("Mar-31");
            yesLeap.add("Apr-30");
            yesLeap.add("May-31");
            yesLeap.add("Jun-30");
            yesLeap.add("Jul-31");
            yesLeap.add("Aug-31");
            yesLeap.add("Sept-30");
            yesLeap.add("Oct-31");
            yesLeap.add("Nov-30");
            yesLeap.add("Dec-31");
            
            // Initial variable
            boolean leap = false;
            
            // Asks user what year he/she wants to see
            Scanner input = new Scanner(System.in);
            System.out.println("Enter year you wish to know that month length of: ");
            int year = input.nextInt();
            
            // If/else statement that helps find if the given year is a leap year
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        leap = true;
                    } else {
                        leap = false;
                    }
                } else {
                    leap = true;
                }
            } else {
                leap = false;
            }
            
            // If/else statement that prints the right day numbers for that year
            if(leap) {
                System.out.println("These are the days in each month for year " + year + " : " + yesLeap);
            } else {
                System.out.println("These are the days in each month for year " + year + " : " + noLeap);
            }
            
        }
}
