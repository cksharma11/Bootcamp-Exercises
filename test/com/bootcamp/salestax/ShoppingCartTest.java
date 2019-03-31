package com.bootcamp.salestax;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ShoppingCartTest {
    private List<Tax> importedBookTaxes;
    private List<Tax> importedPerfumeTaxes;
    private ShoppingCart shoppingCart;
    @BeforeEach
    void setUp() {
        shoppingCart = new ShoppingCart();
        importedBookTaxes = new ArrayList<>();
        importedBookTaxes.add(ImportDuty.getInstance());

        importedPerfumeTaxes = new ArrayList<>();
        importedPerfumeTaxes.add(ImportDuty.getInstance());
        importedPerfumeTaxes.add(BasicSalesTax.getInstance());
    }

    @Test
    void shouldAddProduct() {
        Product imported_book = new Product("Imported Book", 12.49, importedBookTaxes);
        shoppingCart.addToCart(imported_book);

        assertTrue(shoppingCart.addToCart(imported_book));
    }

    @Test
    void shouldCalculatePriceOfProductsInCart() {
        Product imported_book = new Product("Imported Book", 10.0, importedBookTaxes);
        Product imported_perfume = new Product("Imported perfume", 27.99, importedPerfumeTaxes);

        shoppingCart.addToCart(imported_book);
        shoppingCart.addToCart(imported_perfume);

        double totalCost = Util.round(shoppingCart.calculateTotalPrice());
        double expected = 42.69;

        assertEquals(expected, totalCost);
    }
}