package com.step.shape;

public class Square implements Shape{
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
        return 4 * this.side.getValue();
    }
}
