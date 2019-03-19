package com.bootcamp.probability;

import java.util.Objects;

public class Probability {
    private static final int LOWER_BOUND = 0;
    private static final int UPPER_BOUND = 1;
    private double value;

    Probability(double value) throws InvalidProbabilityException {
        this.validateProbability(value);
        this.value = value;
    }

    private void validateProbability(double probability) throws InvalidProbabilityException {
        if (probability < LOWER_BOUND || probability > UPPER_BOUND) {
            throw new InvalidProbabilityException("Invalid probability.");
        }
    }

    Probability calculateImprobability() throws InvalidProbabilityException {
        return new Probability(UPPER_BOUND - this.value);
    }

    @Override
    public boolean equals(Object probability) {
        if (this == probability) return true;
        if (probability == null || getClass() != probability.getClass()) return false;
        Probability that = (Probability) probability;
        return Double.compare(that.value, value) == 0;
    }
}
