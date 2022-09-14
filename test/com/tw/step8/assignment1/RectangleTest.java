package com.tw.step8.assignment1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void ShouldGiveAreaOfTheRectangle() {
        Rectangle rectangle = Rectangle.createRectangle(3, 4);
        assertEquals(12, rectangle.area());
    }

    @Test
    void ShouldGivePerimeterOfTheRectangle() {
        Rectangle rectangle = Rectangle.createRectangle(3, 4);
        assertEquals(14, rectangle.perimeter());
    }

    @Test
    void ShouldGiveAreaOfSquare() {
        Rectangle square = Rectangle.createSquare(4);
        assertEquals(16, square.area());
    }

    @Test
    void ShouldGivePerimeterOfSquare() {
        Rectangle square = Rectangle.createSquare(4);
        assertEquals(16, square.perimeter());
    }

}