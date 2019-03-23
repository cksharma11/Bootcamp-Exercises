package com.bootcamp.pizza;

enum ToppingTypes {
    VEGETABLE(new Price(20)),
    CHICKEN(new Price(30)),
    MOZZARELLA(new Price(10)),
    TOMATO_SAUCE(new Price(5)),
    EXTRA_CHEESE(new Price(25)),
    JALAPENO(new Price(40));

    private Price price;

    ToppingTypes(Price price){
        this.price = price;
    }

    Price getPrice(){
        return this.price;
    }
}
