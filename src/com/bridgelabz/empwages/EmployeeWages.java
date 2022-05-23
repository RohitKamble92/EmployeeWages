package com.bridgelabz.empwages;

public class EmployeeWages {

    public static void main(String[] args) {
        int FULL_TIME = 1;
        int PART_TIME = 2;
        int EMP_RATE_PER_HR = 20;
        int FULL_TIME_HR = 8;
        int PART_TIME_HR = 4;
        int empCheck = (int) Math.floor(Math.random() * 10 % 3);

        int empHrs = 0;
        if (empCheck == FULL_TIME) {
            empHrs = FULL_TIME_HR;
        } else if(empCheck==PART_TIME){
            empHrs=PART_TIME_HR;
        }
        else {
            empHrs = 0;
        }
        int empWage = empHrs * EMP_RATE_PER_HR;
        System.out.println("Emp Wage is " + empWage);
    }
}
