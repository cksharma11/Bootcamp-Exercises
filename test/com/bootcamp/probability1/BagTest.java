package com.bootcamp.probability1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BagTest {

    private Bag bag;
    @BeforeEach
    void setUp() {
        bag = new Bag(12);
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
        bag.addValidator(new GreenBallValidator(3));

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

        bag.addValidator(new RedGreenRatioValidator(2));

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

        bag.addValidator(new YellowBallValidator(40));

        assertFalse(bag.add(new Ball(Color.YELLOW)));
    }
}

/*
A bag can hold a maximum of 12 balls.

Balls (blue, green, red or yellow in color) are added to the bag one at a time.
No removals.

There are some arbitrary rules for what can be in a bag.
Max of 3 green balls. DONE
Red balls cannot be more than double the green balls at the time of addition. DONE
No limit on blue balls.
Not more than 40% of the balls may be yellow.
It should be possible to get a summary of the contents of the bag at any time.
*/
