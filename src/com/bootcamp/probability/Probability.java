package com.bootcamp.probability;

public class Probability {
    private double value;

    Probability(double value) throws InvalidProbabilityException {
        this.validateProbability(value);
        this.value = value;
    }

    private void validateProbability(double probability) throws InvalidProbabilityException {
        if (probability < 0 || probability > 1) {
            throw new InvalidProbabilityException("Invalid probability.");
        }
    }
}
