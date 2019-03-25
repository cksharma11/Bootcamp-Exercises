package com.bootcamp.shape;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class DimensionTest {

    @Test
    void shouldThrowsAnException() {
        assertThrows(InvalidDimension.class, () -> new Dimension(-1));
    }

    @Test
    void shouldNotThrowsAnException() {
        try {
            new Dimension(1);
        } catch (Exception e) {
            fail("should not throws exception");
        }
    }

}