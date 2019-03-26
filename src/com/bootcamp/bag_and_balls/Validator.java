package com.bootcamp.bag_and_balls;

interface Validator {
    boolean validate(Countable countable) throws TooManyYellowBallException, InvalidRedGreenBallRatioException, TooManyGreenBallException, OutOfCapacityException;
}
