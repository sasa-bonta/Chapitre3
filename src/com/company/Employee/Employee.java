package com.company.Employee;

public class Employee {
    private String firstName;
    private String secondName;
    private double monthlySalary;

    //Constructor

    public Employee(String firstName, String secondName, double monthlySalary) {
        this.firstName = firstName;
        this.secondName = secondName;
        if (monthlySalary > 0)
            this.monthlySalary = monthlySalary;
    }

    //Getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0)
            this.monthlySalary = monthlySalary;
    }
}
