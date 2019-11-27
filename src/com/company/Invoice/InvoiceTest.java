package com.company.Invoice;

import com.company.Invoice.Invoice;

import java.util.Scanner;

public class InvoiceTest {

    public static void main(String[] args) {

        Invoice invoice = new Invoice("AB033C55", "HP Laptop", 27, 235.50);

        Scanner input = new Scanner(System.in);

        System.out.printf("Enter how many %s would you like to buy :", invoice.getDescription());
        int quantity = input.nextInt();

        System.out.printf("The invoice is %f :", invoice.getInvoiceAmount(quantity));
    }
}