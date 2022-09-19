package com.tw.step8.assignment5;

import com.tw.step8.assignment5.exception.*;
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

        assertThrows(RedBallsSizeExceededException.class,()->bag.add(thirdRedBall));
    }

    @Test
    void shouldNotAddYellowBallsMoreThan40PercentOfCurrentCapacity() {
        Bag bag = new Bag(12);
        Ball yellowBall = new Ball(Color.YELLOW);

        assertThrows(YellowBallsSizeExceededException.class,()->bag.add(yellowBall));
    }

    @Test
    void shouldAddYellowBallsWhenTheyAreLessThan40PercentOfCurrentCapacity() throws AddBallException {
        Bag bag = new Bag(12);
        Ball greenBall = new Ball(Color.GREEN);
        Ball redBall = new Ball(Color.RED);
        Ball yellowBall = new Ball(Color.YELLOW);

        bag.add(greenBall);
        bag.add(redBall);

        assertTrue(bag.add(yellowBall));
    }

    @Test
    void ShouldAddEitherOfBlackOrBlue() throws AddBallException {
        Bag firstBag = new Bag(12);
        Bag secondBag = new Bag(12);
        Ball blackBall = new Ball(Color.BLACK);
        Ball blueBall = new Ball(Color.BLUE);

        firstBag.add(blackBall);
        secondBag.add(blueBall);

        assertThrows(BlueAndBlackBallsTogetherException.class,() -> firstBag.add(blueBall));
        assertThrows(BlueAndBlackBallsTogetherException.class,() -> secondBag.add(blackBall));
    }
}