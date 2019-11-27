package com.company.Invoice;

public class Invoice {
    private String partNumber;
    private String description;
    private int quantity;
    private double price;

    //Constructor
    public Invoice(String partNumber, String description, int quantity, double price) {
        this.partNumber = partNumber;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    //Method get invoice Amount
    public double getInvoiceAmount(int quantity) {
        if (getQuantity() < 0)
            setQuantity(0);
        if (getPrice() < 0)
            setPrice(0.0);
        if (quantity > 0 && quantity <= getQuantity())
            return quantity * price;
        else return 0.0;
    }

    //Getters and Setters
    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
