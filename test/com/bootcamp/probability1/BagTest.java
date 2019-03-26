package com.bootcamp.probability1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BagTest {

    private Bag bag;
    @BeforeEach
    void setUp() {
        bag = new Bag(12);
        bag.addValidator(new RedGreenRatioValidator(2));
        bag.addValidator(new CapacityValidator(12));
        bag.addValidator(new GreenBallValidator(3));
        bag.addValidator(new YellowBallValidator(40));
    }

    @Test
    void shouldAddTheGivenBallToBag() {
        assertTrue(bag.add(new Ball(Color.GREEN)));
    }

    @Test
    void shouldNotAddMoreThanThreeGreenBalls() {
        bag.add(new Ball(Color.GREEN));
        bag.add(new Ball(Color.GREEN));
        bag.add(new Ball(Color.GREEN));

        assertFalse(bag.add(new Ball(Color.GREEN)));
    }

    @Test
    void shouldNotAddRedBallIfCountOfRedBallsIsDoubleOfGreenBall() {
        bag.add(new Ball(Color.GREEN));
        bag.add(new Ball(Color.GREEN));

        bag.add(new Ball(Color.RED));
        bag.add(new Ball(Color.RED));
        bag.add(new Ball(Color.RED));
        bag.add(new Ball(Color.RED));

        assertFalse(bag.add(new Ball(Color.RED)));
    }

    @Test
    void shouldNotAddYellowBallIfThereAre40PercentYellowBallInBag() {
        bag.add(new Ball(Color.GREEN));
        bag.add(new Ball(Color.GREEN));

        bag.add(new Ball(Color.RED));
        bag.add(new Ball(Color.RED));
        bag.add(new Ball(Color.RED));
        bag.add(new Ball(Color.RED));

        bag.add(new Ball(Color.YELLOW));
        bag.add(new Ball(Color.YELLOW));

        assertFalse(bag.add(new Ball(Color.YELLOW)));
    }

    @Test
    void shouldNotAddBallsMoreThanBagCapacity() {
        for (int i = 0; i <12 ; i++) {
            bag.add(new Ball(Color.BLUE));
        }

        assertFalse(bag.add(new Ball(Color.BLUE)));
    }
}
