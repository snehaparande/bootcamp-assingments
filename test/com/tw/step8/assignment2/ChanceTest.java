package com.tw.step8.assignment2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChanceTest {

	@Test
	void ShouldGiveTheValueRepresentationOfTheChance() throws InvalidProbability {
		Chance chance = Chance.createChance(0.5);
		assertEquals(0.5, chance.possible());
	}

	@Test
	void ShouldGiveTheValueRepresentationOfNotHavingChance() throws InvalidProbability {
		Chance chance = Chance.createChance(0.25);
		assertEquals(0.75, chance.notPossible());
	}

	@Test
	void ShouldThrowInvalidProbabilityException() {
		try {
			Chance chance = Chance.createChance(2);
		} catch (InvalidProbability e) {
			assertEquals("Probability should be between 0 and 1", e.getMessage());
		}

	}
}