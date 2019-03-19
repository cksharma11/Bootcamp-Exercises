package com.bootcamp.probability;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {

    @Test
    void createProbabilityWithValidInput() {
        try {
            new Probability(0.5D);
        } catch (InvalidProbabilityException e) {
            fail("Should not throw exception");
        }

    }


    @Test
    void createProbabilityWithInValidInput() {
        try {
            new Probability(1.5D);
            fail("Should throw exception");
        } catch (InvalidProbabilityException ignored) {
        }

    }
}