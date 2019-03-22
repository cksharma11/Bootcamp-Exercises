package com.bootcamp.unit;

import java.math.BigDecimal;
import java.util.HashMap;

class Unit {
    private static final Type LENGTH = Type.LENGTH;
    private static final Type VOLUME = Type.VOLUME;
    static final Unit INCH = new Unit(new BigDecimal(1), Unit.LENGTH);
    static final Unit FEET = new Unit(new BigDecimal(12), Unit.LENGTH);
    static final Unit MILLIMETER = new Unit(new BigDecimal(0.04), Unit.LENGTH);
    static final Unit CENTIMETER = new Unit(new BigDecimal(0.4), Unit.LENGTH);

    static final Unit GALLON = new Unit(new BigDecimal(3.78), Unit.VOLUME);
    static final Unit LITER = new Unit(new BigDecimal(1), Unit.VOLUME);
    private final Object type;
    private BigDecimal ratio;

    private static final HashMap<Type, Unit> standardUnits = new HashMap<>();

    static {
        standardUnits.put(LENGTH, INCH);
        standardUnits.put(VOLUME, LITER);
    }

    private enum Type{
        LENGTH,
        VOLUME
    }

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

    Unit getStandardUnit(){
        return standardUnits.get(this.type);
    }
}
