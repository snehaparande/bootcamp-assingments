package com.tw.step8.assignment5;

public enum Color {
    GREEN(3), RED(12);

    private final int maxBalls;

    Color(int maxBalls) {
        this.maxBalls = maxBalls;
    }

    public int getMaxBalls() {
        return maxBalls;
    }
}
