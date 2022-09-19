package com.tw.step8.assignment5;

import com.tw.step8.assignment5.exception.*;

public enum Color {
    GREEN(){
        private final static int MAX_GREEN_BALLS = 3;
        @Override
        public void validateAdditionOfNewBall(Queryable balls) throws AddBallException {
            super.validateAdditionOfNewBall(balls);

            int presentNoOfBalls = balls.getSizeOf(this);
            if (presentNoOfBalls == MAX_GREEN_BALLS) {
                throw new IdenticalBallLimitExceededException(MAX_GREEN_BALLS, this.toString());
            }
        }
    },
    RED(){
        @Override
        public void validateAdditionOfNewBall(Queryable balls) throws AddBallException {
            super.validateAdditionOfNewBall(balls);
            int noOfGreenBalls = balls.getSizeOf(Color.GREEN);
            int noOfRedBalls = balls.getSizeOf(Color.RED);

            if (noOfGreenBalls * 2 == noOfRedBalls) {
                throw new RedBallsSizeExceededException();
            }
        }
    },
    YELLOW(){
        @Override
        public void validateAdditionOfNewBall(Queryable balls) throws AddBallException {
            super.validateAdditionOfNewBall(balls);

            int noOfYellowAfterAddition = balls.getSizeOf(Color.YELLOW) + 1;
            int totalAfterAddition = balls.getTotalSize() + 1;
            double yellowBallsPercentage = (double) noOfYellowAfterAddition / totalAfterAddition;

            if (yellowBallsPercentage > 0.4) {
                throw new YellowBallsSizeExceededException();
            }
        }
    },
    BLACK(){
        @Override
        public void validateAdditionOfNewBall(Queryable balls) throws AddBallException {
            super.validateAdditionOfNewBall(balls);

            if (balls.isPresent(Color.BLUE)){
                throw new BlueAndBlackBallsTogetherException();
            }
        }
    }, BLUE(){
        @Override
        public void validateAdditionOfNewBall(Queryable balls) throws AddBallException {
            super.validateAdditionOfNewBall(balls);

            if (balls.isPresent(Color.BLACK)){
                throw new BlueAndBlackBallsTogetherException();
            }
        }
    };

    public void validateAdditionOfNewBall(Queryable balls) throws AddBallException {
        if (balls.isFull()) {
            throw new BagLimitExceededException();
        }
    }
}
