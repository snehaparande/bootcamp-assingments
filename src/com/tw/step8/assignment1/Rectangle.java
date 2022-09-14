package com.tw.step8.assignment1;

public class Rectangle implements Shape{

    private final double length;
    private final double breadth;

    public Rectangle(double length, double breadth) {

        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double area() {
        return length * breadth;
    }

    @Override
    public double perimeter() {
        return (this.length + this.breadth) * 2;
    }
}
