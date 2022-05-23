package com.bridgelabz.empwages;

public class EmployeeWages {

    public static void main(String[] args) {
        int FULL_TIME = 1;
        int EMP_RATE_PER_HR = 20;
        int FULL_DAY_HR = 8;
        int empCheck = (int) Math.floor(Math.random() * 10 % 2);

        int empHrs = 0;
        if (empCheck == FULL_TIME) {
            empHrs = FULL_DAY_HR;
        } else {
           empHrs=0;
        }
        int empWage =empHrs * EMP_RATE_PER_HR ;
        System.out.println("Emp Wage is "+empWage);
    }
}
