package com.tw.step8.assignment4.exception;

public class InvalidLotCapacityException extends Throwable {
	public InvalidLotCapacityException(Integer capacity) {
		super(capacity + ": Invalid capacity for a lot");
	}
}
