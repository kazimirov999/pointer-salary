package com.salary;

public class EmployeeMonth implements Salary {
    private int rate = 1000;
    private int coefficientMonth = 2 * 24 * 31;

    @Override
    public void salary() {
        int salary = rate * coefficientMonth;
        System.out.println("EmployeeMonth salary is: " + salary + " usd");

    }
}
