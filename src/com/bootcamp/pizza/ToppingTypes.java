package com.bootcamp.pizza;

enum ToppingTypes {
    VEGETABLE(20D),
    CHICKEN(30D),
    MOZZARELLA(10D),
    TOMATO_SAUCE(5D),
    EXTRA_CHEESE(25D),
    JALAPENO(40D);

    private Double price;

    ToppingTypes(Double price){
        this.price = price;
    }

    Double getPrice(){
        return this.price;
    }
}
