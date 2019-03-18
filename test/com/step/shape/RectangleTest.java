package com.step.shape;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    @DisplayName("Should return the perimeter of given rectangle with dimensions without floating value")
    void calculatePerimeter() throws Exception {
        Rectangle rectangle = new Rectangle(new Dimension(10D), new Dimension(2D));
        double actual = rectangle.calculatePerimeter();
        double expected = 24;
        assertEquals(actual, expected);
    }

    @Test
    @DisplayName("Should return the perimeter of given rectangle with dimensions with floating value")
    void calculatePerimeter1() throws Exception {
        Rectangle rectangle = new Rectangle(new Dimension(10.11D), new Dimension(2D));
        double actual = rectangle.calculatePerimeter();
        double expected = 24.22;
        assertEquals(actual, expected);
    }

    @Test
    @DisplayName("Should return the area of given rectangle with dimensions without floating value")
    void calculateArea1() throws Exception {
        Rectangle rectangle = new Rectangle(new Dimension(10D), new Dimension(2D));
        double actual = rectangle.calculateArea();
        double expected = 20;
        assertEquals(actual, expected);
    }

    @Test
    @DisplayName("Should return the area of given rectangle with dimensions with floating value")
    void calculateArea3() throws Exception {
        Rectangle rectangle = new Rectangle(new Dimension(3.11), new Dimension(2.3));
        double actual = rectangle.calculateArea();
        double expected = 7.1;
        assertEquals(actual, expected, 1);
    }
}