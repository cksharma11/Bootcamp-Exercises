package com.bootcamp.unit;

import java.math.BigDecimal;
import java.math.RoundingMode;

class Quantity {
    private BigDecimal value;
    private Unit unit;

    Quantity(BigDecimal value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    Quantity add(Quantity quantity) {
        BigDecimal baseValue = this.unit.toBaseValue(this.value);
        BigDecimal otherBaseValue = quantity.unit.toBaseValue(quantity.value);
        BigDecimal result = (baseValue.add(otherBaseValue));
        return new Quantity(result, this.unit.getStandardUnit());
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Quantity)) return false;
        Quantity quantity = (Quantity) o;
        if (!(this.unit.isSameType(quantity.unit))) return false;
        BigDecimal firstValue = this.unit.toBaseValue(this.value);
        BigDecimal secondValue = quantity.unit.toBaseValue(quantity.value);
        return firstValue.setScale(2, RoundingMode.FLOOR).
                equals(secondValue.setScale(2, RoundingMode.FLOOR));
    }
}
