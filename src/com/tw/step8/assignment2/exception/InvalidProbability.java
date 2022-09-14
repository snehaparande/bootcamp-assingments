package com.tw.step8.assignment2.exception;

public class InvalidProbability extends Throwable {
	public InvalidProbability() {
		super("Probability should be between 0 and 1");
	}
}
