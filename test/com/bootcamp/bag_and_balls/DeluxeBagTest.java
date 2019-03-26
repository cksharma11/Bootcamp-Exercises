package com.bootcamp.bag_and_balls;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeluxeBagTest {

    private DeluxeBag deluxeBag;
    @BeforeEach
    void setUp() {
        deluxeBag = new DeluxeBag(20);
        deluxeBag.addValidator(new RedGreenRatioValidator(2));
        deluxeBag.addValidator(new CapacityValidator(20));
        deluxeBag.addValidator(new GreenBallValidator(3));
        deluxeBag.addValidator(new YellowBallValidator(40));
        deluxeBag.addValidator(new BlackBallValidator(2));
    }

    @Test
    void shouldNotAddMoreThanThreeGreenBalls() {
        deluxeBag.add(new Ball(Color.GREEN));
        deluxeBag.add(new Ball(Color.GREEN));
        deluxeBag.add(new Ball(Color.GREEN));

        assertFalse(deluxeBag.add(new Ball(Color.GREEN)));
    }

    @Test
    void shouldNotAddRedBallIfCountOfRedBallsIsDoubleOfGreenBall() {
        deluxeBag.add(new Ball(Color.GREEN));
        deluxeBag.add(new Ball(Color.GREEN));

        deluxeBag.add(new Ball(Color.RED));
        deluxeBag.add(new Ball(Color.RED));
        deluxeBag.add(new Ball(Color.RED));
        deluxeBag.add(new Ball(Color.RED));

        assertFalse(deluxeBag.add(new Ball(Color.RED)));
    }

    @Test
    void shouldAddYellowBallIfThereAreLessThan40PercentYellowBallInBag() {
        deluxeBag.add(new Ball(Color.BLUE));
        deluxeBag.add(new Ball(Color.BLUE));
        deluxeBag.add(new Ball(Color.BLUE));
        deluxeBag.add(new Ball(Color.BLUE));

        assertTrue(deluxeBag.add(new Ball(Color.YELLOW)));
    }

    @Test
    void shouldNotAddYellowBallIfThereAre40PercentYellowBallInBag() {
        deluxeBag.add(new Ball(Color.RED));
        deluxeBag.add(new Ball(Color.RED));

        deluxeBag.add(new Ball(Color.YELLOW));
        deluxeBag.add(new Ball(Color.YELLOW));

        assertFalse(deluxeBag.add(new Ball(Color.YELLOW)));
    }

    @Test
    void shouldNotAddBallsMoreThanBagCapacity() {
        for (int i = 0; i <20 ; i++) {
            deluxeBag.add(new Ball(Color.BLUE));
        }

        assertFalse(deluxeBag.add(new Ball(Color.BLUE)));
    }

    @Test
    void shouldNotAddMoreThanTwoBlackBalls() {
        deluxeBag.add(new Ball(Color.BLACK));
        deluxeBag.add(new Ball(Color.BLACK));

        assertFalse(deluxeBag.add(new Ball(Color.BLACK)));

    }
}