package com.bootcamp.unit;

import java.math.BigDecimal;

public class ScaleAndRatio implements Convertable {
    private BigDecimal scale;
    private BigDecimal ratio;

    public ScaleAndRatio(BigDecimal scale, BigDecimal ratio) {
        this.scale = scale;
        this.ratio = ratio;
    }

    @Override
    public BigDecimal convertToBaseValue(BigDecimal value) {
        BigDecimal multiply = this.ratio.multiply(value);
        return multiply.add(this.scale);
    }
}
