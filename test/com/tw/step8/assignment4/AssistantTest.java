package com.tw.step8.assignment4;

import com.tw.step8.assignment4.exception.InvalidLotCapacityException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssistantTest {
	@Test
	void shouldDisplayTheCurrentParkingLotsStatus() throws InvalidLotCapacityException {
		ParkingLots parkingLots = new ParkingLots();
		Assistant assistant = new Assistant(parkingLots);

		parkingLots.addLot(1);

		String expectedDisplay = "ID: 0\n-------\nCapacity: 1";
		assertEquals(expectedDisplay, assistant.display());
	}

}