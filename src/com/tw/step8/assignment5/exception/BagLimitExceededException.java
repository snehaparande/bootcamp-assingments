package com.tw.step8.assignment5.exception;

public class BagLimitExceededException extends AddBallException {
    public BagLimitExceededException() {
        super("Can not add ball, bag limit exceeded.");
    }

}
