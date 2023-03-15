package com.bridgelabz;

public class EmpWageBuilder {  private final String company;
    private final int empRatePerHour;
    private final int numOfWorkingDays;
    private final int maxHoursPerMonth;
    private int totalEmpWage; // total wage for the company

    // constructor
    public EmpWageBuilder(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

    // method to calculate employee wage
    public void calculateEmpWage() {
        // local variables
        int empHours = 0;
        int totalEmpHours = 0;
        int totalWorkingDays = 0;

        // iterate until maximum working hours or days are reached
        while (totalEmpHours < maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
            totalWorkingDays++;
            // generate a random number to simulate employee attendance
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case 1:
                    empHours = 8; // full day
                    break;
                case 2:
                    empHours = 4; // half day
                    break;
                default:
                    empHours = 0; // absent
            }
            totalEmpHours += empHours;
        }

        // calculate total wage for the company
        totalEmpWage = totalEmpHours * empRatePerHour;
    }

    // method to display total wage for the company
    public void displayTotalEmpWage() {
        System.out.println("Total Employee Wage for Company " + company + ": " + totalEmpWage);
    }

    // main method
    public static void main(String[] args) {
        EmpWageBuilder company1 = new EmpWageBuilder("ABC", 20, 20, 100);
        company1.calculateEmpWage();
        company1.displayTotalEmpWage();

        EmpWageBuilder company2 = new EmpWageBuilder("XYZ", 25, 22, 110);
        company2.calculateEmpWage();
        company2.displayTotalEmpWage();
    }
}
