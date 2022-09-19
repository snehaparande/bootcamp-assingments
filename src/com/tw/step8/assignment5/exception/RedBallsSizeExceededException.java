package com.tw.step8.assignment5.exception;

public class RedBallsSizeExceededException extends  AddBallException{
    public RedBallsSizeExceededException() {
        super("Can not add red balls more than double of green balls.");
    }
}
