package com.tw.step8.assignment5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BagTest {
    @Test
    void shouldAddBallInTheBag() {
        Bag bag = new Bag();
        Ball ball = new Ball();

        assertTrue(bag.add(ball));
    }
}