package com.tw.step8.assignment4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {

	@Test
	void shouldParkACarAndIssueAToken() {
		ParkingLot parkingLot = new ParkingLot(1,5);

		assertEquals(1, parkingLot.park(Vehicle.CAR));
	}

	@Test
	void validateWhetherTheLotIsFull() {
		ParkingLot parkingLotLimitOfOne = new ParkingLot(1, 1);
		parkingLotLimitOfOne.park(Vehicle.CAR);

		ParkingLot parkingLotLimitOfFive = new ParkingLot(2, 5);
		parkingLotLimitOfFive.park(Vehicle.CAR);

		assertTrue(parkingLotLimitOfOne.isFull());
		assertFalse(parkingLotLimitOfFive.isFull());
	}

	@Test
	void validateWhetherTheLotCanBeHandleByATrainee() {
		ParkingLot parkingLotLimitOfFive = new ParkingLot(1, 5);
		parkingLotLimitOfFive.park(Vehicle.CAR);

		ParkingLot parkingLotLimitOfOne = new ParkingLot(1, 1);
		parkingLotLimitOfOne.park(Vehicle.CAR);

		assertTrue(parkingLotLimitOfFive.canTraineeHandle());
		assertFalse(parkingLotLimitOfOne.canTraineeHandle());
	}
}