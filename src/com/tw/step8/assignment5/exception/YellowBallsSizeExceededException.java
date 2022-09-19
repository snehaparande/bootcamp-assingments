package com.tw.step8.assignment5.exception;

public class YellowBallsSizeExceededException extends AddBallException{
    public YellowBallsSizeExceededException() {
        super("Can not add yellow balls more than 40% of current capacity");
    }
}
