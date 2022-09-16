package com.tw.step8.assignment4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {

	@Test
	void shouldParkACarAndIssueAToken() {
		ParkingLot parkingLot = new ParkingLot(5);

		assertEquals(1, parkingLot.park(Vehicle.CAR));
	}

	@Test
	void validateWhetherTheLotIsFull() {
		ParkingLot parkingLot = new ParkingLot(1);
		parkingLot.park(Vehicle.CAR);

		assertTrue(parkingLot.isFull());
	}
}