package com.bootcamp.unit;

import java.math.BigDecimal;

class Quantity {
    private BigDecimal value;
    private Unit unit;

    Quantity(BigDecimal value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Quantity)) return false;
        Quantity quantity = (Quantity) o;
        if(!(this.unit.isSameType(quantity.unit))) return false;
        BigDecimal firstValue = this.unit.toBaseValue(this.value);
        BigDecimal secondValue = quantity.unit.toBaseValue(quantity.value);
        return firstValue.equals(secondValue);
    }
}
