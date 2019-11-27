package com.company.Account;

import com.company.Account.Account;

import java.util.Scanner;

public class AccuntTest {

    public static void main(String[] args) {
        Account account1 = new Account("Jane Green", 50.0);
        Account account2 = new Account("John Blue", 175.0);

        System.out.printf("%s initial balance is $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s initial balance is $%.2f%n", account2.getName(), account2.getBalance());

        Scanner input = new Scanner(System.in);

        System.out.printf("Enter the withdrawal amount for %s account :", account1.getName());
        double withdrawalAmount1 = input.nextDouble();
        account1.withdraw(withdrawalAmount1);

        System.out.printf("%s curent balance is : %f%n", account1.getName(), account1.getBalance());

        System.out.printf("Enter the withdrawal amount for %s account :", account2.getName());
        double withdrawalAmount2 = input.nextDouble();
        account1.withdraw(withdrawalAmount2);

        System.out.printf("%s curent balance is : %f%n", account2.getName(), account2.getBalance());
    }
}
