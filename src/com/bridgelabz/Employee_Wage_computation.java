package com.bridgelabz;
import java.util.Random;
public class Employee_Wage_computation {
    public static void main(String[] args) {
        System.out.println("welcome to employee wage computational problems" );
        int wagePerHour = 10; // $10 per hour
        int workingDaysPerMonth = 20; // 20 working days per month
        int maxWorkingHours = 100; // maximum working hours for the month

        // create a random number generator
        Random random = new Random();
        int totalWorkingDays = 0;
        int totalWorkingHours = 0;
        int wage = 0;

        // keep working until either the maximum working hours or days is reached
        while (totalWorkingDays < workingDaysPerMonth && totalWorkingHours < maxWorkingHours) {
            int randomNumber = random.nextInt(2);

            // check if the employee is full-time or part-time
            if (randomNumber == 0) { // full-time employee
                int workingHoursPerDay = 8; // 8 hours per day

                // check if the employee can work a full day
                if (totalWorkingHours + workingHoursPerDay <= maxWorkingHours) {
                    wage += wagePerHour * workingHoursPerDay;
                    totalWorkingHours += workingHoursPerDay;
                    totalWorkingDays++;
                } else {
                    break;
                }
            } else { // part-time employee
                int workingHoursPerDay = 4; // 4 hours per day

                // check if the employee can work a full day
                if (totalWorkingHours + workingHoursPerDay <= maxWorkingHours) {
                    wage += wagePerHour * workingHoursPerDay;
                    totalWorkingHours += workingHoursPerDay;
                    totalWorkingDays++;
                } else {
                    break;
                }
            }
        }

        System.out.println("Wage for the month: $" + wage);
    }
}
