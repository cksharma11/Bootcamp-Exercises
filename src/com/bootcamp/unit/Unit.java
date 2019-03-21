package com.bootcamp.unit;

import java.math.BigDecimal;

class Unit {
    private static final Object LENGTH = new Object();
    private static final Object VOLUME = new Object();
    static final Unit INCH = new Unit(new BigDecimal(25), Unit.LENGTH);
    static final Unit FEET = new Unit(new BigDecimal(12 * 25), Unit.LENGTH);
    static final Unit MILLIMETER = new Unit(new BigDecimal(1), Unit.LENGTH);
    static final Unit CENTIMETER = new Unit(new BigDecimal(10), Unit.LENGTH);
    static final Unit GALLON = new Unit(new BigDecimal(3.78), Unit.VOLUME);
    static final Unit LITER = new Unit(new BigDecimal(1), Unit.VOLUME);
    private final Object type;
    private BigDecimal ratio;

    private Unit(BigDecimal ratio, Object type) {
        this.ratio = ratio;
        this.type = type;
    }

    BigDecimal toBaseValue(BigDecimal value) {
        return value.multiply(this.ratio);
    }

    boolean isSameType(Unit unit){
        return unit.type.equals(this.type);
    }
}
