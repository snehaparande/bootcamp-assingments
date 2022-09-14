package com.tw.step8.assignment2;

import com.tw.step8.assignment2.exception.InvalidProbability;

public class Chance {

	private final double probability;

	private Chance(double probability) {

		this.probability = probability;
	}

	public static Chance createChance(double probability) throws InvalidProbability {
		if (probability > 1 || probability < 0) {
			throw new InvalidProbability();
		}

		return new Chance(probability);
	}

	public double chance() {
		return this.probability;
	}

	public double noChance() {
		return 1 - this.probability;
	}

	public double and(Chance otherChance) {
		return otherChance.chance() * this.probability;
	}

	public double or(Chance otherChance) {
		return 1 - (this.noChance() * otherChance.noChance());
	}
}
