package com.bootcamp.bag_and_balls;

public class YellowBallValidator implements Validator {
    private int percentage;

    YellowBallValidator(int percentage) {
        this.percentage = percentage;
    }

    @Override
    public boolean validate(Countable countable) throws TooManyYellowBallException {
        if(countable.getCountOf(Color.YELLOW) == 0) {
            return true;
        }
        double yellowBallPercentage = (this.percentage/100D) * countable.getTotalCount();
        if(yellowBallPercentage < countable.getCountOf(Color.YELLOW)) return true;
        throw new TooManyYellowBallException();
    }
}
