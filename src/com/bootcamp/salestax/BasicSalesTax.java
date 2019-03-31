package com.bootcamp.salestax;

public class BasicSalesTax implements Tax {
    private double taxPercentage;
    private static BasicSalesTax instance;

    private BasicSalesTax(double taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    static BasicSalesTax getInstance(){
        if(instance == null){
            return new BasicSalesTax(10);
        }
        return instance;
    }

    @Override
    public double calculateTax(double price) {
        return (this.taxPercentage / 100) * price;
    }
}
