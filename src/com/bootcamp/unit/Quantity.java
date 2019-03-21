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
        Quantity quantity = (Quantity) o;
        BigDecimal firstValue = this.unit.toBaseValue(this.value);
        BigDecimal secondValue = quantity.unit.toBaseValue(quantity.value);
        return firstValue.equals(secondValue);
    }
}
