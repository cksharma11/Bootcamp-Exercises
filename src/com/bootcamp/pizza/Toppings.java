package com.bootcamp.pizza;

import java.util.ArrayList;
import java.util.List;

class Toppings {
    private List<ToppingTypes> toppings;

    Toppings() {
        this.toppings = new ArrayList<>();
    }

    void addTopping(ToppingTypes topping){
        this.toppings.add(topping);
    }

    double calculateTotalPrice(){
        double totalPrice = 0;
        for (ToppingTypes topping : this.toppings){
            totalPrice += topping.getPrice();
        }
        return totalPrice;
    }
}
