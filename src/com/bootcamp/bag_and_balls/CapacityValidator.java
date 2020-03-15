package com.bootcamp.bag_and_balls;

public class CapacityValidator implements Validator {
    private int capacity;

    CapacityValidator(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public boolean validate(Countable countable) throws OutOfCapacityException {
        if (countable.getTotalCount() < this.capacity) return true;
        throw new OutOfCapacityException();
    }
}
