package com.bootcamp.unit;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class QuantityTest {
    @Test
    void shouldReturnTrueWhenOneFeetIsComparedWithTwelveInches() {
        Quantity oneFeet = new Quantity(new BigDecimal(1), Unit.FEET);
        Quantity twelveInch = new Quantity(new BigDecimal(12), Unit.INCH);
        assertEquals(oneFeet, twelveInch);
    }

    @Test
    void shouldReturnFalseWhenOneFeetIsComparedWithOneInch() {
        Quantity oneFeet = new Quantity(new BigDecimal(1), Unit.FEET);
        Quantity twelveInch = new Quantity(new BigDecimal(1), Unit.INCH);
        assertNotEquals(oneFeet, twelveInch);
    }

    @Test
    void shouldReturnTrueWhenOneMillimeterIsComparedWithOneInch() {
        Quantity oneMillimeter = new Quantity(new BigDecimal(1), Unit.MILLIMETER);
        Quantity twelveInch = new Quantity(new BigDecimal(25), Unit.INCH);
        assertNotEquals(oneMillimeter, twelveInch);
    }

    @Test
    void shouldReturnTrueWhenTwoInchesAreComparedWithFiveCentimeters() {
        Quantity twoInches = new Quantity(new BigDecimal(2), Unit.INCH);
        Quantity fiveCentimeters = new Quantity(new BigDecimal(5), Unit.CENTIMETER);
        assertEquals(twoInches, fiveCentimeters);
    }

    @Test
    void shouldReturnFalseWhenTwoInchesAreComparedWithTwoCentimeters() {
        Quantity twoInches = new Quantity(new BigDecimal(2), Unit.INCH);
        Quantity twoCentimeters = new Quantity(new BigDecimal(2), Unit.CENTIMETER);
        assertNotEquals(twoInches, twoCentimeters);
    }
}
