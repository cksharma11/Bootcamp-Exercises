package com.bootcamp.probability1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Bag {
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
        if (!this.checkValidations(ball)) return false;
        this.updateCount(ball.getColor());
        return this.balls.add(ball);
    }

    private boolean checkValidations(Ball ball) {
        return this.validators.stream().allMatch(validator -> {
            return validator.validate(this.ballCounts, ball.getColor());
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
}


/*
A bag can hold a maximum of 12 balls.

Balls (blue, green, red or yellow in color) are added to the bag one at a time.
No removals.

There are some arbitrary rules for what can be in a bag.
Max of 3 green balls.
Red balls cannot be more than double the green balls at the time of addition.
No limit on blue balls.
Not more than 40% of the balls may be yellow.
It should be possible to get a summary of the contents of the bag at any time.
*/

