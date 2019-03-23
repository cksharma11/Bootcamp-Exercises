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

    Price calculateTotalPrice(){
        Price totalPrice = new Price(0);
        for (ToppingTypes topping : this.toppings){
            totalPrice = totalPrice.add(topping.getPrice());
        }
        return totalPrice;
    }
}
