package com.tw.step8.assignment5;

public class Ball {
    private final Color color;

    public Ball(Color color) {
        this.color = color;
    }

    boolean isSameColor(Color color){
        return this.color.equals(color);
    }

    public Color getColor() {
        return color;
    }
}
