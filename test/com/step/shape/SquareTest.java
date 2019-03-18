package com.step.shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void shouldReturnArea() throws Exception {
        Square square = new Square(new Dimension(2));
        assertEquals(4, square.calculateArea());
    }

    @Test
    void shouldReturnPerimeter() throws Exception {
        Square square = new Square(new Dimension(4));
        assertEquals(16, square.calculatePerimeter());
    }
}