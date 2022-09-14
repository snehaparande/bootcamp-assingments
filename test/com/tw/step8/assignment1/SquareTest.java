package com.tw.step8.assignment1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    void ShouldGiveAreaOfSquare() {
        Square square = new Square(4);
        assertEquals(16, square.area());
    }

    @Test
    void ShouldGivePerimeterOfSquare() {
        Square square = new Square(4);
        assertEquals(16, square.perimeter());
    }
}