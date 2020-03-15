package com.bootcamp.bag_and_balls;

public class RedGreenRatioValidator implements Validator {
    private int ratio;

    RedGreenRatioValidator(int ratio) {
        this.ratio = ratio;
    }

    @Override
    public boolean validate(Countable countable) throws InvalidRedGreenBallRatioException {
        if (countable.getCountOf(Color.GREEN) * this.ratio == 0) return true;
        if (countable.getCountOf(Color.RED) < countable.getCountOf(Color.GREEN) * this.ratio) {
            return true;
        }
        throw new InvalidRedGreenBallRatioException();
    }
}
