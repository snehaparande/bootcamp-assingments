package com.tw.step8.assignment4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotifierTest {
	@Test
	void shouldNotifyTheGivenStatus() {
		Notifier notifier = new Notifier(new Recipients[]{});
		assertTrue(notifier.notify(1, LotStatus.TAXABLE));
	}
}