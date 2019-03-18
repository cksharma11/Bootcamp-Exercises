package com.step.shape;

public class Rectangle implements Shape{
    private Dimension width;
    private Dimension height;

    Rectangle(Dimension width, Dimension height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return this.width.getValue() * this.height.getValue();
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (this.width.getValue() + this.height.getValue());
    }
}
