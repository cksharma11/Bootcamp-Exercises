package com.bootcamp.salestax;

import java.util.ArrayList;
import java.util.List;

class ShoppingCart {
    private List<Product> cart;

    ShoppingCart() {
        this.cart = new ArrayList<>();
    }

    boolean addToCart(Product product) {
        return this.cart.add(product);
    }


    double calculateTotalPrice() {
        double totalPrice = 0;
        for (Product product : this.cart) {
            totalPrice += product.getPrice() + product.calculateTax();
        }
        return totalPrice;
    }
}
