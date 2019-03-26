package com.bootcamp.bag_and_balls;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Bag implements Countable{
    private final int capacity;
    private HashMap<Color, Integer> ballCounts;
    private List<Ball> balls;
    private List<Validator> validators;

    Bag(int capacity) {
        this.capacity = capacity;
        this.balls = new ArrayList<>(capacity);
        this.validators = new ArrayList<>();
        this.ballCounts = new HashMap<>();
    }

    boolean add(Ball ball) {
        if (!this.checkValidations()) return false;
        this.updateCount(ball.getColor());
        return this.balls.add(ball);
    }

    private boolean checkValidations() {
        return this.validators.stream().allMatch(validator -> {
            try {
                return validator.validate(this);
            } catch (TooManyYellowBallException | InvalidRedGreenBallRatioException
                    | TooManyGreenBallException | OutOfCapacityException e) {
                return false;
            }
        });
    }

    private void updateCount(Color color) {
        this.ballCounts.putIfAbsent(color, 0);
        Integer count = this.ballCounts.get(color);
        this.ballCounts.put(color, ++count);
    }

    void addValidator(Validator validator) {
        this.validators.add(validator);
    }

    @Override
    public Integer getCountOf(Color ballColor) {
        return this.ballCounts.getOrDefault(ballColor, 0);
    }

    @Override
    public Integer getTotalCount() {
        int totalCount = 0;
        for(Color color : ballCounts.keySet()) {
            totalCount += ballCounts.get(color);
        }
        return totalCount;
    }
}
