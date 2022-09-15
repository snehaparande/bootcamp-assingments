package com.tw.step8.assignment2;

import com.tw.step8.assignment2.exception.InvalidProbabilityException;

public class Chance {

	private final double probability;

	private Chance(double probability) {

		this.probability = probability;
	}

	public static Chance createChance(double probability) throws InvalidProbabilityException {
		if (probability > 1 || probability < 0) {
			throw new InvalidProbabilityException();
		}

		return new Chance(probability);
	}

	public double not() {
		return 1 - this.probability;
	}

	public double and(Chance otherChance) {
 		return otherChance.probability * this.probability;
	}

	public double or(Chance otherChance) {
		return 1 - (this.not() * otherChance.not());
	}
}
