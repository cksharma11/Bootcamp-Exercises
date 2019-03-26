package com.bootcamp.probability1;

import java.util.HashMap;

public class GreenBallValidator implements Validator {
    private int maxLimit;

    public GreenBallValidator(int maxLimit) {
        this.maxLimit = maxLimit;
    }

    @Override
    public boolean validate(HashMap<Color, Integer> ballCounts, Color ballColor) {
        return ballCounts.get(ballColor) < maxLimit;
    }
}
