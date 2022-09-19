package com.tw.step8.assignment5;

import com.tw.step8.assignment5.exception.AddBallException;
import com.tw.step8.assignment5.exception.BagLimitExceededException;
import com.tw.step8.assignment5.exception.IdenticalBallLimitExceededException;
import com.tw.step8.assignment5.exception.RedBallSizeExceededException;

import java.util.HashSet;
import java.util.stream.Collectors;

public class Bag {

    private final HashSet<Ball> balls;
    private final int capacity;

    public Bag(int capacity) {
        this.capacity = capacity;
        this.balls = new HashSet<>();
    }

    public boolean add(Ball ball) throws AddBallException {
        if (this.isFull()){
            throw new BagLimitExceededException();
        }
        int presentNoOfBalls = this.getNoOfBalls(ball.getColor());
        if (presentNoOfBalls == ball.getMaxCapacity()){
            throw new IdenticalBallLimitExceededException(ball.getColor());
        }

        int noOfGreenBalls = this.getNoOfBalls(Color.GREEN);
        int noOfRedBalls = this.getNoOfBalls(Color.RED);

        if (ball.getColor() == Color.RED && noOfGreenBalls * 2 == noOfRedBalls){
            throw  new RedBallSizeExceededException();
        }



        return this.balls.add(ball);
    }

    private int getNoOfBalls(Color color) {
        return this.balls.stream().filter(ballInBag -> ballInBag.isSameColor(color)).collect(Collectors.toSet()).size();
    }

    private boolean isFull() {
        return this.balls.size() == capacity;
    }
}
