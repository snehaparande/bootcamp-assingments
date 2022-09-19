package com.tw.step8.assignment5;

import com.tw.step8.assignment5.exception.AddBallException;

import java.util.HashSet;
import java.util.stream.Collectors;

public class Balls implements Countable {
    private final HashSet<Ball> balls;
    private final int capacity;

    public Balls(int capacity) {
        this.capacity = capacity;
        this.balls = new HashSet<>();
    }


    @Override
    public int getSizeOf(Color color) {
        return this.balls.stream()
                .filter(ballInBag -> ballInBag.isSameColor(color))
                .collect(Collectors.toSet())
                .size();
    }

    @Override
    public int getTotalSize() {
        return this.balls.size();
    }

    @Override
    public boolean isFull() {
        return this.balls.size() == capacity;
    }

    public boolean add(Ball ball) throws AddBallException {
        return this.balls.add(ball);
    }

}
