package com.bootcamp.probability1;

import java.util.HashMap;

public class YellowBallValidator implements Validator {
    private int percentage;

    YellowBallValidator(int percentage) {

        this.percentage = percentage;
    }

    @Override
    public boolean validate(HashMap<Color, Integer> ballCounts, Color ballColor) {
        if(ballColor != Color.YELLOW) return true;
        int yellowBallPercentage = this.getTotalBalls(ballCounts);
        return yellowBallPercentage < ballCounts.get(ballColor);
    }

    private int getTotalBalls(HashMap<Color, Integer> ballCounts) {
        int totalCount = 0;

        for(Color color : ballCounts.keySet()) {
            totalCount += ballCounts.get(color);
        }

        return totalCount;
    }
}
