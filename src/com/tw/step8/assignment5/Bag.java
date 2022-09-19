package com.tw.step8.assignment5;

import java.util.HashSet;

public class Bag {

    private HashSet<Ball> balls;

    public Bag() {
        this.balls = new HashSet<>();
    }

    public boolean add(Ball ball) {
        return this.balls.add(ball);
    }
}
