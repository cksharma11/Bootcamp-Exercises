package com.bootcamp.unit;

import java.math.BigDecimal;
import java.util.HashMap;

class Unit {

    private static final Type LENGTH = Type.LENGTH;
    static final Unit INCH = new Unit(new Ratio(new BigDecimal(1)), Unit.LENGTH);
    static final Unit FEET = new Unit(new Ratio(new BigDecimal(12)), Unit.LENGTH);

    private static final Type VOLUME = Type.VOLUME;
    static final Unit MILLIMETER = new Unit(new Ratio(new BigDecimal(0.04)), Unit.LENGTH);
    static final Unit CENTIMETER = new Unit(new Ratio(new BigDecimal(0.4)), Unit.LENGTH);

    private static final Type TEMPERATURE = Type.TEMPERATURE;
    static final Unit CELSIUS = new Unit(new ScaleAndRatio(new BigDecimal(32),new BigDecimal(1.8)),Unit.TEMPERATURE);
    static final Unit FAHRENHEIT = new Unit(new ScaleAndRatio(new BigDecimal(0),new BigDecimal(1)),Unit.TEMPERATURE);

    static final Unit GALLON = new Unit(new Ratio(new BigDecimal(3.78)), Unit.VOLUME);
    static final Unit LITER = new Unit(new Ratio(new BigDecimal(1)), Unit.VOLUME);
    private final Object type;
    private Convertable ratio;

    private static final HashMap<Type, Unit> standardUnits = new HashMap<>();

    static {
        standardUnits.put(LENGTH, INCH);
        standardUnits.put(VOLUME, LITER);
        standardUnits.put(TEMPERATURE,CELSIUS);
    }

    private enum Type{
        LENGTH,
        VOLUME,
        TEMPERATURE
    }

    private Unit(Convertable ratio, Object type) {
        this.ratio = ratio;
        this.type = type;
    }

    BigDecimal toBaseValue(BigDecimal value) {
        return this.ratio.convertToBaseValue(value);
    }

    boolean isSameType(Unit unit){
        return unit.type.equals(this.type);
    }

    Unit getStandardUnit(){
        return standardUnits.get(this.type);
    }
}
