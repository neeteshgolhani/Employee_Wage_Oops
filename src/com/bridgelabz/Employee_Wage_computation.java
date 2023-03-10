package com.bridgelabz;
import java.util.Random;
public class Employee_Wage_computation {
    public static void main(String[] args) {
        System.out.println("welcome to employee wage computational problems" );
        // create a random number generator
        Random random = new Random();
        // generate a random number between 0 and 2
        int randomNumber = random.nextInt(3);

        // use switch statement to check the employee status
        switch (randomNumber) {
            case 0:
                System.out.println("Employee is absent.");
                break;
            case 1:
                int wage = 8 * 10; // 8 hours * $10/hour
                System.out.println("Employee is a part-time worker. Wage: $" + wage);
                break;
            case 2:
                wage = 40 * 10; // 40 hours * $10/hour
                System.out.println("Employee is a full-time worker. Wage: $" + wage);
                break;
            default:
                System.out.println("Invalid status");
                break;

        }
    }
}
