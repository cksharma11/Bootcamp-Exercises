package com.bootcamp.bag_and_balls;

public class BlackBallValidator implements Validator {
    private int limit;

    BlackBallValidator(int limit) {

        this.limit = limit;
    }

    @Override
    public boolean validate(Countable countable) throws TooManyBlackBallException {
        if(countable.getCountOf(Color.BLACK) < limit) return true;
        throw new TooManyBlackBallException();
    }
}
