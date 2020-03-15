package com.bootcamp.unit;

import java.math.BigDecimal;

public class Ratio implements Convertable {
    private BigDecimal ratio;

    public Ratio(BigDecimal ratio) {
        this.ratio = ratio;
    }

    @Override
    public BigDecimal convertToBaseValue(BigDecimal value) {
        return this.ratio.multiply(value);
    }
}
