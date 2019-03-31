package com.bootcamp.salestax;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductTest {

    private List<Tax> taxes;
    @BeforeEach
    void setUp() {
        taxes = new ArrayList<>();
    }

    @Test
    void shouldCalculateBasicSalesTax() {
        taxes.add(BasicSalesTax.getInstance());

        Product product = new Product("music cd",14.99,taxes);

        double expected = 1.50;
        double actual = Util.round(product.calculateTax());

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateImportDuty() {
        taxes.add(ImportDuty.getInstance());

        Product product = new Product("Imported chocolates",10,taxes);

        double expected = 0.50;
        double actual = Util.round(product.calculateTax());

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateTaxForProductsHavingMoreThanOneTaxes() {
        taxes.add(BasicSalesTax.getInstance());
        taxes.add(ImportDuty.getInstance());

        Product product = new Product("Imported perfume",27.99,taxes);

        double expected = 4.2;
        double actual = Util.round(product.calculateTax());

        assertEquals(expected, actual);
    }
}