package com.bridgelabz;
import java.util.Random;
    class Employee {
        private int wagePerHour;
        private int workingDaysPerMonth;
        private int maxWorkingHours;

        public Employee(int wagePerHour, int workingDaysPerMonth, int maxWorkingHours) {
            this.wagePerHour = wagePerHour;
            this.workingDaysPerMonth = workingDaysPerMonth;
            this.maxWorkingHours = maxWorkingHours;
        }

        public int computeWage() {
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

            return wage;
        }

        public static void main(String[] args) {
            Employee fullTimeEmployee = new Employee(10, 20, 100);
            int fullTimeWage = fullTimeEmployee.computeWage();
            System.out.println("Full-time employee wage for the month: $" + fullTimeWage);

            Employee partTimeEmployee = new Employee(10, 20, 100);
            int partTimeWage = partTimeEmployee.computeWage();
            System.out.println("Part-time employee wage for the month: $" + partTimeWage);
        }
    }
