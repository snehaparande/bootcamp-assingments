package com.tw.step8.assignment5;

import com.tw.step8.assignment5.exception.BagLimitExceededException;
import com.tw.step8.assignment5.exception.IdenticalBallLimitExceededException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BagTest {
    @Test
    void shouldAddBallInTheBag() throws BagLimitExceededException, IdenticalBallLimitExceededException {
        Bag bag = new Bag(2);
        Ball greenBall = new Ball(Color.GREEN);

        assertTrue(bag.add(greenBall));
    }

    @Test
    void shouldNotAddBallsMoreThan12() throws BagLimitExceededException, IdenticalBallLimitExceededException {
        Bag bag = new Bag(1);
        Ball greenBall = new Ball(Color.GREEN);
        Ball redBall = new Ball(Color.RED);

        bag.add(greenBall);

        assertThrows(BagLimitExceededException.class, () -> bag.add(redBall));
    }

    @Test
    void shouldThrowExceptionWhenMoreThan3GreenBallsAreAdded() throws BagLimitExceededException, IdenticalBallLimitExceededException {
        Bag bag = new Bag(12);
        Ball firstGreenBall = new Ball(Color.GREEN);
        Ball secondGreenBall = new Ball(Color.GREEN);
        Ball thirdGreenBall = new Ball(Color.GREEN);
        Ball fourthGreenBall = new Ball(Color.GREEN);

        bag.add(firstGreenBall);
        bag.add(secondGreenBall);
        bag.add(thirdGreenBall);

        assertThrows(IdenticalBallLimitExceededException.class, () -> bag.add(fourthGreenBall));
    }
}