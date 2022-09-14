package com.tw.step8.assignment1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void ShouldGiveAreaOfTheRectangle() {
        Rectangle rectangle = new Rectangle(3, 4);
        assertEquals(12, rectangle.area());
    }
}