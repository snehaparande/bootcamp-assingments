package com.tw.step8.assignment4.exception;

public class NoAvailableSpaceException extends Throwable {
	public NoAvailableSpaceException(Integer ID) {
		super("No available space in parking lot: " +  ID);
	}
}
