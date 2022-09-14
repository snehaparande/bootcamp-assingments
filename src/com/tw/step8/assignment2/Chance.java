package com.tw.step8.assignment2;

public class Chance {

	private final double chance;

	private Chance(double chance) {

		this.chance = chance;
	}

	public static Chance createChance(double chance) throws InvalidProbability {
		if (chance > 1 || chance < 0) {
			throw new InvalidProbability();
		}

		return new Chance(chance);
	}

	public double possible() {
		return this.chance;
	}

	public double notPossible() {
		return 1 - this.chance;
	}
}
