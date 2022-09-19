package com.tw.step8.assignment5;

import com.tw.step8.assignment5.exception.BagLimitExceededException;
import com.tw.step8.assignment5.exception.IdenticalBallLimitExceededException;

import java.util.HashSet;
import java.util.stream.Collectors;

public class Bag {

    private final HashSet<Ball> balls;
    private final int capacity;

    public Bag(int capacity) {
        this.capacity = capacity;
        this.balls = new HashSet<>();
    }

    public boolean add(Ball ball) throws BagLimitExceededException, IdenticalBallLimitExceededException {
        if (this.isFull()){
            throw new BagLimitExceededException();
        }
        int lengthOfCurrentColorBalls = this.balls.stream().filter(ballInBag->ballInBag.isSameColor(ball)).collect(Collectors.toSet()).size();
        if (lengthOfCurrentColorBalls == ball.getMaxCapacity()){
            throw new IdenticalBallLimitExceededException(ball.getColor());
        }
        return this.balls.add(ball);
    }

    private boolean isFull() {
        return this.balls.size() == capacity;
    }
}
