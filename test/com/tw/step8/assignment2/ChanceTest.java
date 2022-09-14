package com.tw.step8.assignment2;

import com.tw.step8.assignment2.exception.InvalidProbability;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChanceTest {
	@Test
	void ShouldGiveTheValueRepresentationOfNotHavingChance() throws InvalidProbability {
		Chance chance = Chance.createChance(0.25);
		assertEquals(0.75, chance.not());
	}

	@Test
	void ShouldThrowInvalidProbabilityException() {
		try {
			Chance chance = Chance.createChance(2);
		} catch (InvalidProbability e) {
			assertEquals("Probability should be between 0 and 1", e.getMessage());
		}

	}

	@Test
	void ShouldGiveTheChanceOfTwoEvents() throws InvalidProbability {
		Chance tails = Chance.createChance(0.5);
		Chance evenDice = Chance.createChance(0.5);

		assertEquals(0.25, tails.and(evenDice));
	}

	@Test
	void ShouldGiveTheChanceOfEitherEvent() throws InvalidProbability {
		Chance firstDice1 = Chance.createChance((double) 1/6);
		Chance secondDice1 = Chance.createChance((double) 1/6);

		Chance firstTails = Chance.createChance(0.5);
		Chance secondTails = Chance.createChance(0.5);

		assertEquals(0.30555, firstDice1.or(secondDice1), 0.01);
		assertEquals(0.75, firstTails.or(secondTails));
	}
}