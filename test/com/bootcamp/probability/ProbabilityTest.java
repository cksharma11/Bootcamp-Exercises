package com.bootcamp.probability;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {

    @Test
    void shouldNotThrowsExceptionForValidValue() {
        assertDoesNotThrow(() -> new Probability(0.5D));
    }

    @Test
    void shouldThrowsExceptionForValueOutOfLowerBound() {
        assertThrows(InvalidProbabilityException.class, () -> new Probability(-1.5D));
    }

    @Test
    void shouldThrowsExceptionForValueOutOfUpperBound() {
        assertThrows(InvalidProbabilityException.class, () -> new Probability(1.5D));
    }

    @Test
    void shouldCalculateImprobability() throws InvalidProbabilityException {
        Probability probability = new Probability(0.6);
        Probability expected = new Probability(0.4);
        Probability actual = probability.not();

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateCombinedProbability() throws InvalidProbabilityException {
        Probability probability1 = new Probability(0.5);
        Probability probability2 = new Probability(0.5);

        Probability expected = new Probability(0.25);
        Probability actual = probability1.and(probability2);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateProbabilityOfAtLeastOne() throws InvalidProbabilityException {
        Probability probability1 = new Probability(0.5);
        Probability probability2 = new Probability(0.5);

        Probability expected = new Probability(0.75);
        Probability actual = probability1.or(probability2);

        assertEquals(expected, actual);
    }
}