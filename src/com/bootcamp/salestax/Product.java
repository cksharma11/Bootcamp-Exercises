package com.bootcamp.salestax;

import java.util.List;

class Product {
    private String name;
    private double price;
    private List<Tax> taxes;

    Product(String name, double price, List<Tax> taxes) {
        this.name = name;
        this.price = price;
        this.taxes = taxes;
    }

    double calculateTax(){
        double taxAmount = 0;
        for (Tax tax : taxes) {
            taxAmount += tax.calculateTax(this.price);
        }
        return taxAmount;
    }

    double getPrice() {
        return this.price;
    }
}
