package com.ss.jb.five;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

// Purpose of this assignment is to see if user inputted a date that lands on Friday the 13th

public class Friday {

    public static void main(String[] args) {
        
        // Ask user to input a date in a specific format
        Scanner input = new Scanner(System.in);

        System.out.println("Enter date in (dd/MM/yyyy):");
        String date = input.next();
        
        Date mydate = validDate(date);
        
        // Checks to see if the date lands on Friday the 13th and prints yes or no
        if (mydate != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(mydate);
            if (calendar.get(Calendar.DAY_OF_WEEK) == 6 && calendar.get(Calendar.DAY_OF_MONTH) == 13) {
                System.out.println("Date does occured on Friday the 13th.");
            } else {
                System.out.println("Date does not occured on Friday the 13th.");
            }

        } else {
            System.out.println("Date is invalid.");
        }

    }

    // Method that varifies that the date is an actual date on the calendar
    public static Date validDate(String date) {

        Date mydate = null;
        
        if (isValidDateFormat(date)) {
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            dateFormat.setLenient(false);
            try {
                mydate = dateFormat.parse(date);
            } catch (ParseException e) {
                mydate = null;
            }
        }
        return mydate;
    }

    // Method to check that user input the right format
    private static boolean isValidDateFormat(String date) {
        
        String pattern = "(0?[1-9]|[12][0-9]|3[01])\\/(0?[1-9]|1[0-2])\\/([0-9]{4})";
        boolean result = false;
        
        if (date.matches(pattern)) {
            result = true;
        }
        return result;
    }

}
