package com.bootcamp.pizza;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaTest {

    @Test
    void shouldCalculatePriceOfPizzaWithoutToppings() {
        Pizza pizza = new Pizza();

        assertEquals(50, pizza.calculateTotalPrice());
    }

    @Test
    void shouldCalculatePriceOfPizzaWithToppings() {
        Pizza pizza = new Pizza();
        pizza.addTopping(ToppingTypes.CHICKEN);

        assertEquals(80, pizza.calculateTotalPrice());
    }
}