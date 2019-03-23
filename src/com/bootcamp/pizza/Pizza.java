package com.bootcamp.pizza;

class Pizza {
    private Double basePrice;
    private Toppings toppings;

    Pizza() {
        this.basePrice = 50D;
        this.toppings = new Toppings();
    }

    Double calculateTotalPrice(){
        return this.basePrice + this.toppings.calculateTotalPrice();
    }

    void addTopping(ToppingTypes topping) {
        this.toppings.addTopping(topping);
    }

}
