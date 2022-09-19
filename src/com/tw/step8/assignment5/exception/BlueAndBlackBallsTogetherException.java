package com.tw.step8.assignment5.exception;

public class BlueAndBlackBallsTogetherException extends AddBallException {
    public BlueAndBlackBallsTogetherException() {
        super("Either blue or black balls can be present in the bag");
    }
}
