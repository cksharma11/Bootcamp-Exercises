package com.bootcamp.probability1;

interface Validator {
    boolean validate(Countable countable) throws TooManyYellowBallException, InvalidRedGreenBallRatioException, TooManyGreenBallException, OutOfCapacityException;
}
