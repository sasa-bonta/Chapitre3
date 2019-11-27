package com.company.Account;

public class Account {
    private String name;
    private double balance;

    //Constructor

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    //Method withdraw
    public void withdraw(double withdrawalAmount){
        if (withdrawalAmount >balance)
            System.out.println("Withdrawal amount exceed the Accounts balance");
        else {
            balance = balance - withdrawalAmount;
        }
    }

    //Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

