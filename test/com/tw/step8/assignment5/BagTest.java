package com.tw.step8.assignment5;

import com.tw.step8.assignment5.exception.AddBallException;
import com.tw.step8.assignment5.exception.BagLimitExceededException;
import com.tw.step8.assignment5.exception.IdenticalBallLimitExceededException;
import com.tw.step8.assignment5.exception.RedBallSizeExceededException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BagTest {
    @Test
    void shouldAddBallInTheBag() throws AddBallException{
        Bag bag = new Bag(2);
        Ball greenBall = new Ball(Color.GREEN);

        assertTrue(bag.add(greenBall));
    }

    @Test
    void shouldNotAddBallsMoreThan12() throws AddBallException{
        Bag bag = new Bag(1);
        Ball greenBall = new Ball(Color.GREEN);
        Ball redBall = new Ball(Color.RED);

        bag.add(greenBall);

        assertThrows(BagLimitExceededException.class, () -> bag.add(redBall));
    }

    @Test
    void shouldThrowExceptionWhenMoreThan3GreenBallsAreAdded() throws AddBallException{
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

    @Test
    void shouldNotAddRedBallMoreThanDoubleOfGreen() throws AddBallException {
        Bag bag = new Bag(12);
        Ball greenBall = new Ball(Color.GREEN);
        Ball firstRedBall = new Ball(Color.RED);
        Ball secondRedBall = new Ball(Color.RED);
        Ball thirdRedBall = new Ball(Color.RED);

        bag.add(greenBall);
        bag.add(firstRedBall);
        bag.add(secondRedBall);

        assertThrows(RedBallSizeExceededException.class,()->bag.add(thirdRedBall));
    }
}