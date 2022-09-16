package com.tw.step8.assignment4;

import com.tw.step8.assignment4.exception.InvalidLotCapacityException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotsTest {
	@Test
	void shouldThrowInvalidCapacityExceptionOnInvalidCapacity() {
		ParkingLots parkingLots = new ParkingLots();

		assertThrows(InvalidLotCapacityException.class,() -> parkingLots.addLot(0));
	}
}