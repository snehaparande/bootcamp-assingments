package com.tw.step8.assignment5;

import com.tw.step8.assignment5.exception.AddBallException;
import com.tw.step8.assignment5.exception.BagLimitExceededException;
import com.tw.step8.assignment5.exception.IdenticalBallLimitExceededException;
import com.tw.step8.assignment5.exception.RedBallSizeExceededException;

public enum Color {
    GREEN(3){
        @Override
        public void validateAdditionOfNewBall(Countable balls) throws AddBallException {
            super.validateAdditionOfNewBall(balls);

            int presentNoOfBalls = balls.getSizeOf(this);
            if (presentNoOfBalls == this.getMaxBalls()) {
                throw new IdenticalBallLimitExceededException(this.getMaxBalls(), this.toString());
            }
        }
    },
    RED(12){
        @Override
        public void validateAdditionOfNewBall(Countable balls) throws AddBallException {
            super.validateAdditionOfNewBall(balls);
            int noOfGreenBalls = balls.getSizeOf(Color.GREEN);
            int noOfRedBalls = balls.getSizeOf(Color.RED);

            if (noOfGreenBalls * 2 == noOfRedBalls) {
                throw new RedBallSizeExceededException();
            }
        }
    },
    YELLOW(12);

    private final int maxBalls;

    Color(int maxBalls) {
        this.maxBalls = maxBalls;
    }

    public int getMaxBalls() {
        return maxBalls;
    }

    public void validateAdditionOfNewBall(Countable balls) throws AddBallException {
        if (balls.isFull()) {
            throw new BagLimitExceededException();
        }
    }
}
