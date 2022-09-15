package com.tw.step8.assignment2.exception;

public class InvalidProbabilityException extends Throwable {
	public InvalidProbabilityException() {
		super("Probability should be between 0 and 1");
	}
}
