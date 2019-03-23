package com.bootcamp.pizza;

class Pizza {
    private Price basePrice;
    private Toppings toppings;

    Pizza() {
        this.basePrice = new Price(50);
        this.toppings = new Toppings();
    }

    Price calculateTotalPrice(){
        return this.basePrice.add(this.toppings.calculateTotalPrice());
    }

    Pizza addTopping(ToppingTypes topping) {
        this.toppings.addTopping(topping);
        return this;
    }

}
