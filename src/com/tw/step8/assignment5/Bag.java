package com.tw.step8.assignment5;

import com.tw.step8.assignment5.exception.AddBallException;

public class Bag {

    private final Balls balls;

    public Bag(int capacity) {
        this.balls = new Balls(capacity);
    }

    public boolean add(Ball ball) throws AddBallException {
        return this.balls.add(ball);
    }

}
