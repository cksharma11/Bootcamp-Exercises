package com.bootcamp.unit;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class QuantityTest {
    @Test
    void assertOneFeetEqualsTwelveInches() {
        Quantity oneFeet = new Quantity(new BigDecimal(1), Unit.FEET);
        Quantity twelveInch = new Quantity(new BigDecimal(12), Unit.INCH);
        assertEquals(oneFeet, twelveInch);
    }

    @Test
    void assertOneFeetNotEqualsOneInches() {
        Quantity oneFeet = new Quantity(new BigDecimal(1), Unit.FEET);
        Quantity twelveInch = new Quantity(new BigDecimal(1), Unit.INCH);
        assertNotEquals(oneFeet, twelveInch);
    }

    @Test
    void assertOneMMEqualsTwentyFiveInches() {
        Quantity oneMillimeter = new Quantity(new BigDecimal(1), Unit.MILLIMETER);
        Quantity twelveInch = new Quantity(new BigDecimal(25), Unit.INCH);
        assertNotEquals(oneMillimeter, twelveInch);
    }

    @Test
    void assertTwoInchesEqualsFiveCentimeters() {
        Quantity twoInches = new Quantity(new BigDecimal(2), Unit.INCH);
        Quantity fiveCentimeters = new Quantity(new BigDecimal(5), Unit.CENTIMETER);
        assertEquals(twoInches, fiveCentimeters);
    }

    @Test
    void assertTwoInchesNotEqualsTwoCM() {
        Quantity twoInches = new Quantity(new BigDecimal(2), Unit.INCH);
        Quantity twoCentimeters = new Quantity(new BigDecimal(2), Unit.CENTIMETER);
        assertNotEquals(twoInches, twoCentimeters);
    }

    @Test
    void assertOneCMEqualsTenMM() {
        Quantity oneCM = new Quantity(new BigDecimal(1), Unit.CENTIMETER);
        Quantity tenMM = new Quantity(new BigDecimal(10), Unit.MILLIMETER);
        assertEquals(oneCM, tenMM);
    }

    @Test
    void assertTwoCMNotEqualsTenMM() {
        Quantity twoCM = new Quantity(new BigDecimal(2), Unit.CENTIMETER);
        Quantity tenMM = new Quantity(new BigDecimal(10), Unit.MILLIMETER);
        assertNotEquals(twoCM, tenMM);
    }

    @Test
    void assertOneGallonEqualsThreePointSevenEightLiters() {
        Quantity oneGallon = new Quantity(new BigDecimal(1), Unit.GALLON);
        Quantity threePointSevenEightLiter = new Quantity(new BigDecimal(3.78), Unit.LITER);
        assertEquals(oneGallon, threePointSevenEightLiter);
    }


    @Test
    void assertOneGallonDoesNotEqualsThreeLiters() {
        Quantity oneGallon = new Quantity(new BigDecimal(1), Unit.GALLON);
        Quantity threeLiter = new Quantity(new BigDecimal(3), Unit.LITER);
        assertNotEquals(oneGallon, threeLiter);
    }

    @Test
    void shouldAddTwoQuantitiesOfSameUnit() {
        Quantity twoInches = new Quantity(new BigDecimal(2), Unit.INCH);
        Quantity oneInch = new Quantity(new BigDecimal(1), Unit.INCH);

        Quantity expected = new Quantity(new BigDecimal(3), Unit.INCH);
        Quantity actual = twoInches.add(oneInch);
        assertEquals(expected, actual);
    }

    @Test
    void shouldAddTwoDifferentQuantitiesOfDifferentUnits() {
        Quantity twoInches = new Quantity(new BigDecimal(2), Unit.INCH);
        Quantity twoAndHalfCM = new Quantity(new BigDecimal(2.5), Unit.CENTIMETER);

        Quantity expected = new Quantity(new BigDecimal(3.0), Unit.INCH);
        Quantity actual = twoInches.add(twoAndHalfCM);
        assertEquals(expected, actual);
    }

    @Test
    void shouldAddTwoDifferentQuantitiesOfDifferentUnitsOfVolume() {
        Quantity oneGallon = new Quantity(new BigDecimal(1), Unit.GALLON);
        Quantity oneLiter = new Quantity(new BigDecimal(1), Unit.LITER);

        Quantity expected = new Quantity(new BigDecimal(4.779), Unit.LITER);
        Quantity actual = oneGallon.add(oneLiter);
        assertEquals(expected, actual);
    }
}
