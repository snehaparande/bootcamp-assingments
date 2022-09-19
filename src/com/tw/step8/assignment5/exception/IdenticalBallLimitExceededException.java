package com.tw.step8.assignment5.exception;

import com.tw.step8.assignment5.Color;

public class IdenticalBallLimitExceededException extends Throwable {
    public IdenticalBallLimitExceededException(Color color) {
        super(String.format("Can not add ball, maximum %d of %s color balls can be added", color.getMaxBalls(), color.toString()));
    }
}
