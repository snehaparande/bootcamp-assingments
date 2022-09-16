package com.tw.step8.assignment4;

import com.tw.step8.assignment4.exception.NoAvailableSpaceException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {

	@Test
	void shouldParkACarAndIssueAToken() throws NoAvailableSpaceException {
		ParkingLot parkingLot = new ParkingLot(1,5);

		assertEquals(1, parkingLot.add(Vehicle.CAR));
	}

	@Test
	void validateWhetherTheLotIsFull() throws NoAvailableSpaceException {
		ParkingLot parkingLotLimitOfOne = new ParkingLot(1, 1);
		parkingLotLimitOfOne.add(Vehicle.CAR);

		ParkingLot parkingLotLimitOfFive = new ParkingLot(2, 5);
		parkingLotLimitOfFive.add(Vehicle.CAR);

		assertTrue(parkingLotLimitOfOne.isFull());
		assertFalse(parkingLotLimitOfFive.isFull());
	}

	@Test
	void validateWhetherTheLotCanBeHandleByATrainee() throws NoAvailableSpaceException {
		ParkingLot parkingLotLimitOfFive = new ParkingLot(1, 5);
		parkingLotLimitOfFive.add(Vehicle.CAR);

		ParkingLot parkingLotLimitOfOne = new ParkingLot(1, 1);
		parkingLotLimitOfOne.add(Vehicle.CAR);

		assertTrue(parkingLotLimitOfFive.canTraineeHandle());
		assertFalse(parkingLotLimitOfOne.canTraineeHandle());
	}

	@Test
	void shouldThrowNoAvailableSpaceException() throws NoAvailableSpaceException {
		ParkingLot parkingLotLimitOfOne = new ParkingLot(1, 1);
		parkingLotLimitOfOne.add(Vehicle.CAR);

		assertThrows(NoAvailableSpaceException.class, () -> parkingLotLimitOfOne.add(Vehicle.CAR));

	}

	@Test
	void shouldUpdateTheLotStateToTraineeHandleable() throws NoAvailableSpaceException {
		ParkingLot parkingLotLimitOfTwo = new ParkingLot(1, 2);
		parkingLotLimitOfTwo.add(Vehicle.CAR);

		assertEquals(LotStatus.TRAINEE_HANDLEABLE, parkingLotLimitOfTwo.status);
	}

	@Test
	void shouldUpdateTheLotStateToTaxable() throws NoAvailableSpaceException {
		ParkingLot parkingLotLimitOfTwo = new ParkingLot(1, 1);
		parkingLotLimitOfTwo.add(Vehicle.CAR);

		assertEquals(LotStatus.TAXABLE, parkingLotLimitOfTwo.status);
	}

}