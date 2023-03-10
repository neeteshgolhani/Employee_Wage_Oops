package com.bridgelabz;
import java.util.Random;
public class Employee_Wage_computation {
    public static void main(String[] args) {
        System.out.println("welcome to employee wage computational problems" );
        // create a random number generator
        Random random = new Random();

        // generate a random number between 0 and 2
        int randomNumber = random.nextInt(3);

        // check if the random number is 0 (absent), 1 (part-time), or 2 (full-time)
        if (randomNumber == 0) {
            System.out.println("Employee is absent.");
        } else if (randomNumber == 1) {
            int wage = 8 * 10; // 8 hours * $10/hour
            System.out.println("Employee is a part-time worker. Wage: $" + wage);
        } else {
            int wage = 40 * 10; // 40 hours * $10/hour
            System.out.println("Employee is a full-time worker. Wage: $" + wage);
        }
    }
}
