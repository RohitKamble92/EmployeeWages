package com.bridgelabz.empwages;

public class EmployeeWages {

    public static final int FULL_TIME = 1;
    public static final int PART_TIME = 2;
    public static final int EMP_RATE_PER_HR = 20;
    public static final int FULL_TIME_HR = 8;
    public static final int PART_TIME_HR = 4;
    public static final int TOTAL_WORKING_DAYS = 20;
    public static final int MAX_HRS = 100;

    public static void main(String[] args) {
        int totalWage = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        while (totalEmpHrs <= MAX_HRS && totalWorkingDays < TOTAL_WORKING_DAYS) {

            totalWorkingDays++;

            int empCheck = (int) Math.floor(Math.random() * 10 % 3);

            int empHrs = 0;

            switch (empCheck) {
                case FULL_TIME:
                    empHrs = FULL_TIME_HR;
                    break;
                case PART_TIME:
                    empHrs = PART_TIME_HR;
                    break;
                default:
                    empHrs = 0;
            }

            totalEmpHrs = totalEmpHrs + empHrs;
        }
        totalWage = totalEmpHrs * EMP_RATE_PER_HR;
        System.out.println("totalEmpHrs"+totalEmpHrs);
        System.out.println("totalWorkingDays"+totalWorkingDays);
        System.out.println("Total wage" +totalWage);
    }
}

