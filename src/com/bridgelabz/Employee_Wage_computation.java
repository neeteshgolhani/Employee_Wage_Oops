package com.bridgelabz;
import java.util.Random;
public class Employee_Wage_computation {
    public static void main(String[] args) {
        System.out.println("welcome to employee wage computational problems" );
        int wagePerHour = 10; // $10 per hour
        int workingDaysPerMonth = 20; // 20 working days per month
        // create a random number generator
        Random random = new Random();
        // generate a random number between 0 and 2
        int randomNumber = random.nextInt(3);

        // check if the employee is full-time or part-time
        if (randomNumber == 0) { // full-time employee
            int workingHoursPerDay = 8; // 8 hours per day

            int wagePerMonth = wagePerHour * workingHoursPerDay * workingDaysPerMonth;

            System.out.println("Full-time employee wage per month: $" + wagePerMonth);
        } else { // part-time employee
            int workingHoursPerDay = 4; // 4 hours per day

            int wagePerMonth = wagePerHour * workingHoursPerDay * workingDaysPerMonth;

            System.out.println("Part-time employee wage per month: $" + wagePerMonth);

        }
    }
}
