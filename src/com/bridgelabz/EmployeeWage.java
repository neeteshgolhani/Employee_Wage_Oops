package com.bridgelabz;

import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {
        Random rand = new Random();
        int attendance = rand.nextInt(2);
        if ( attendance == 0 ) {
            System.out.println("Employee is present");
        }
        else{
            System.out.println("Employee is absent");

        }
        System.out.println("Welcome To Employee Wage Computation Problems");
    }
}