package com.ss.jb.five;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

// Purpose of this assignment is to print all the Mondays in a given month

public class Mondays {

    public static void main(String[] args) {
        
        // Asks user to input a month 
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the month you want to see all Mondays of: ");
        String mon = input.next();
        
        // Gets the month days
        Month month = Month.valueOf(mon.toUpperCase());

        // Finds all the Mondays of that month and prints it out
        System.out.printf("For the month of %s:%n", month);
        LocalDate date = Year.now().atMonth(month).atDay(1).
                with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        Month mi = date.getMonth();
        while (mi == month) {
            System.out.printf("%s%n", date);
            date = date.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
            mi = date.getMonth();
        }
    }

}
