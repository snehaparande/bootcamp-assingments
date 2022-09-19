package com.tw.step8.assignment5;

public class Ball {
    private final Color color;

    public Ball(Color color) {
        this.color = color;
    }

    public int getMaxCapacity(){
        return this.color.getMaxBalls();
    }

    boolean isSameColor(Ball otherBall){
        return this.color.equals(otherBall.color);
    }

    public Color getColor() {
        return color;
    }
}
