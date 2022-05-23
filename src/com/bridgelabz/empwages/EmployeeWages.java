package com.bridgelabz.empwages;

public class EmployeeWages {

    public static void main(String[] args) {
        int FULL_TIME = 1;
        int empCheck = (int) Math.floor(Math.random() * 10 % 2);
        System.out.println(empCheck);

        if (empCheck == FULL_TIME) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }
}
