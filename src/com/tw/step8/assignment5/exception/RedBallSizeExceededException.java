package com.tw.step8.assignment5.exception;

public class RedBallSizeExceededException extends  AddBallException{
    public RedBallSizeExceededException() {
        super("Can not add red balls more than double of green balls.");
    }
}
