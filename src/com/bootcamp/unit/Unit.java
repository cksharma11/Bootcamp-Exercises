package com.bootcamp.unit;

import java.math.BigDecimal;

class Unit {
    static final Unit INCH = new Unit(new BigDecimal(25));
    static final Unit FEET = new Unit(new BigDecimal(12 * 25));
    static final Unit MILLIMETER = new Unit(new BigDecimal(1));
    static final Unit CENTIMETER = new Unit(new BigDecimal(10));
    private BigDecimal ratio;

    private Unit(BigDecimal ratio) {
        this.ratio = ratio;
    }

    BigDecimal toBaseValue(BigDecimal value) {
        return value.multiply(this.ratio);
    }
}
