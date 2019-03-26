package com.bootcamp.bag_and_balls;

public class GreenBallValidator implements Validator {
    private int maxLimit;

    GreenBallValidator(int maxLimit) {
        this.maxLimit = maxLimit;
    }

    @Override
    public boolean validate(Countable countable) throws TooManyGreenBallException {
        if(countable.getCountOf(Color.GREEN) < maxLimit) return true;
        throw new TooManyGreenBallException();
    }
}
