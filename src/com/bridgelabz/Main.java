package com.bridgelabz;
public class EmpWageBuilder {
    private String companyName;
    private int empRatePerHour;
    private int numWorkingDays;
    private int maxWorkingHours;
    private int totalWage;

    public EmpWageBuilder(String companyName, int empRatePerHour, int numWorkingDays, int maxWorkingHours) {
        this.companyName = companyName;
        this.empRatePerHour = empRatePerHour;
        this.numWorkingDays = numWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
        this.totalWage = 0;
    }

    public void calculateTotalWage() {
        int totalWorkingHours = 0;
        int totalWorkingDays = 0;

        while (totalWorkingDays < numWorkingDays && totalWorkingHours < maxWorkingHours) {
            int empHours = getEmpHours();
            totalWorkingHours += empHours;
            totalWorkingDays++;
        }

        totalWage = totalWorkingHours * empRatePerHour;
    }

    private int getEmpHours() {
        int isFullTime = 1;
        int isPartTime = 2;
        int empHours = 0;

        int empCheck = (int) Math.floor(Math.random() * 10) % 3;

        switch (empCheck) {
            case isFullTime:
                empHours = 8;
                break;
            case isPartTime:
                empHours = 4;
                break;
            default:
                empHours = 0;
        }

        return empHours;
    }

    public void printTotalWage() {
        System.out.println("Total wage for " + companyName + " is " + totalWage);
    }
}
public class Main {
    public static void main(String[] args) {
        EmpWageBuilder company1 = new EmpWageBuilder("Company 1", 20, 20, 100);
        company1.calculateTotalWage();
        company1.printTotalWage();

        EmpWageBuilder company2 = new EmpWageBuilder("Company 2", 25, 15, 80);
        company2.calculateTotalWage();
        company2.printTotalWage();
    }
}