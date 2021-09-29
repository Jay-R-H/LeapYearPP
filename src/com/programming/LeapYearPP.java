package com.programming;

import java.util.Scanner;

public class LeapYearPP {

    public static void main(String[] args) {

        // The input for the year is taken .
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the year to be checked for leap year :" );
        int year = sc.nextInt();

        // The checking of the year for leap year
        if ((year % 4) == 0) {
            System.out.println("The year " + year + " is a leap year");
        }
        else if ((year % 100 == 0) && (year % 400 == 0) ) {
            System.out.println("The year " + year + " is a leap year ");
        }
        else {
            System.out.println(" The year " + year + " is not a leap year");
        }
    }

}
