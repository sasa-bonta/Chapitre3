package com.company.Employee;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Adam", "Moran", 1568.23);
        Employee employee2 = new Employee("Thomas", "Peterson", 1983.76);

        System.out.printf("%s %s yearly salary is : %f%n", employee1.getFirstName(), employee1.getSecondName(), employee1.getMonthlySalary() * 12);
        System.out.printf("%s %s yearly salary is : %f%n", employee2.getFirstName(), employee2.getSecondName(), employee2.getMonthlySalary() * 12);

        employee1.setMonthlySalary(employee1.getMonthlySalary() * 1.1);
        employee2.setMonthlySalary(employee2.getMonthlySalary() * 1.1);

        System.out.println("%The salarys after their 10% rase");

        System.out.printf("%s %s yearly salary is : %f%n", employee1.getFirstName(), employee1.getSecondName(), employee1.getMonthlySalary() * 12);
        System.out.printf("%s %s yearly salary is : %f%n", employee2.getFirstName(), employee2.getSecondName(), employee2.getMonthlySalary() * 12);
    }
}
