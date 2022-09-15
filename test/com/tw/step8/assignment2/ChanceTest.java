package com.tw.step8.assignment2;

import com.tw.step8.assignment2.exception.InvalidProbabilityException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChanceTest {
	@Test
	void shouldReturnNotOfAChance() throws InvalidProbabilityException {
		Chance OneOnDice = Chance.createChance(1.0/6);
		assertEquals(0.8333, OneOnDice.not(), 0.001);
	}

	@Test
	void shouldThrowExceptionWhenProbabilityIsMoreThanOne() {
		assertThrows(InvalidProbabilityException.class, () -> Chance.createChance(2));
	}

	@Test
	void shouldThrowExceptionWhenProbabilityIsLessThanZero() {
		assertThrows(InvalidProbabilityException.class, () -> Chance.createChance(-1));
	}

	@Test
	void shouldReturnCombinationOfTwoChances() throws InvalidProbabilityException {
		Chance tails = Chance.createChance(0.5);
		Chance OneOnDice = Chance.createChance(1.0/6);

		assertEquals(0.0833, tails.and(OneOnDice), 0.001);
	}

	@Test
	void shouldReturnOrOfTwoChances() throws InvalidProbabilityException {
		Chance firstDice1 = Chance.createChance( 1.0/6);
		Chance secondDice1 = Chance.createChance( 1.0/6);

		Chance firstTails = Chance.createChance(0.5);
		Chance secondTails = Chance.createChance(0.5);

		assertEquals(0.3055, firstDice1.or(secondDice1), 0.001);
		assertEquals(0.75, firstTails.or(secondTails));
	}
}