package com.salary;

public class EmployeeHour implements Salary {
    private int rate = 1000;
    private int coefficientHour = 2;

    @Override
    public void salary() {
        int salary = rate * coefficientHour;
        System.out.println("EmployeeHour salary is: " + salary + " usd");
    }
}
