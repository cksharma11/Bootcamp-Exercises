package com.bootcamp.salestax;

public class ImportDuty implements Tax {
    private double taxPercentage;
    private static ImportDuty instance;

    private ImportDuty(double taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    static ImportDuty getInstance(){
        if(instance == null){
            return new ImportDuty(5);
        }
        return instance;
    }

    @Override
    public double calculateTax(double price) {
        return (this.taxPercentage / 100) * price;
    }
}
