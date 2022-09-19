package com.tw.step8.assignment4;

import com.tw.step8.assignment4.exception.InvalidLotCapacityException;
import com.tw.step8.assignment4.exception.NoAvailableSpaceException;
import org.junit.jupiter.api.Test;

class AttendantTest {
	@Test
	void shouldParkAVehicleInAValidParkingLot() throws InvalidLotCapacityException, NoAvailableSpaceException {
		ParkingLots parkingLots = new ParkingLots(new Notifier(new Recipients[]{}));
		parkingLots.addLot(2);

		Attendant attendant = new Attendant(parkingLots);
		Integer token = attendant.park(0, Vehicle.CAR);
	}
}