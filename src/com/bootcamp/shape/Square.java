package com.bootcamp.shape;

public class Square implements Shape{
    public static final int NUMBER_OF_SIDES = 4;
    private final Dimension side;

    Square(Dimension side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return this.side.getValue()*this.side.getValue();
    }

    @Override
    public double calculatePerimeter() {
        return NUMBER_OF_SIDES * this.side.getValue();
    }
}
