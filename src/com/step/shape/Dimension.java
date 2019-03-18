package com.step.shape;

public class Dimension {
    private final double value;

    Dimension(double value) throws InvalidDimension {
        this.validateDimension(value);
        this.value = value;
    }

    public double getValue(){
        return this.value;
    }

    private void validateDimension(double value) throws InvalidDimension{
        if(value < 0) throw new InvalidDimension("Invalid Value");
    }
}
