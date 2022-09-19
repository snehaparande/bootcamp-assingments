package com.tw.step8.assignment5;

import com.tw.step8.assignment5.exception.AddBallException;

import java.util.HashSet;
import java.util.stream.Collectors;

public class Balls implements Queryable {
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

    @Override
    public boolean isPresent(Color color) {
        return this.getSizeOf(color) > 0;
    }

    public boolean add(Ball ball) throws AddBallException {
        return this.balls.add(ball);
    }

}
