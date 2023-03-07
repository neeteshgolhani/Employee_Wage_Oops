package com.bridgelabz;

import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation Problems");
        Random rand = new Random();
        int attendance = rand.nextInt(2);
        if ( attendance == 0 ) {
            System.out.println("Employee is present");
            int wagePerHour = 20;
            int fullDayHour = 8;
            int dailyWage = wagePerHour * fullDayHour;
            System.out.println("Daily employee wage is: " + dailyWage);
        }
        else{
            System.out.println("Employee is absent");
        }
    }
}