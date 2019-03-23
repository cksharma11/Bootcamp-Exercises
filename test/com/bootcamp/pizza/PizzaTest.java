package com.bootcamp.pizza;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaTest {

    @Test
    void shouldCalculatePriceOfPizzaWithoutToppings() {
        Pizza pizza = new Pizza();

        assertEquals(new Price(50), pizza.calculateTotalPrice());
    }

    @Test
    void shouldCalculatePriceOfPizzaWithToppings() {
        Pizza pizza = new Pizza();
        pizza.addTopping(ToppingTypes.CHICKEN).addTopping(ToppingTypes.EXTRA_CHEESE);

        assertEquals(new Price(105), pizza.calculateTotalPrice());
    }
}