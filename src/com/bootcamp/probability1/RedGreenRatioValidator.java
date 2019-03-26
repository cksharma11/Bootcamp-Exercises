package com.bootcamp.probability1;

import java.util.HashMap;

public class RedGreenRatioValidator implements Validator {

    private int ratio;

    RedGreenRatioValidator(int ratio) {
        this.ratio = ratio;
    }

    @Override
    public boolean validate(HashMap<Color, Integer> ballCounts, Color ballColor) {
        if (ballColor != Color.RED) return true;
        ratio = 2;
        return ballCounts.get(ballColor) < ballCounts.get(Color.GREEN) * ratio;
    }
}
