package com.bridgelabz;
public class Company {
    private double wage;
    private int workingDaysPerMonth;
    private int workingHoursPerDay;

    public Company(double wage, int workingDaysPerMonth, int workingHoursPerDay) {
        this.wage = wage;
        this.workingDaysPerMonth = workingDaysPerMonth;
        this.workingHoursPerDay = workingHoursPerDay;
    }

    public double calculateEmployeeWage(int hoursWorked) {
        double dailyWage = wage / workingDaysPerMonth / workingHoursPerDay;
        return hoursWorked * dailyWage;
    }
}
class Main {
    public static void main(String[] args) {
        Company company1 = new Company(2000.0, 20, 8);
        Company company2 = new Company(2500.0, 22, 9);

        double wage1 = company1.calculateEmployeeWage(160);
        double wage2 = company2.calculateEmployeeWage(180);

        System.out.println("Employee wage for company 1: " + wage1);
        System.out.println("Employee wage for company 2: " + wage2);
    }
}



