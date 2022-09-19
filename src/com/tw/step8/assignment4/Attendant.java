package com.tw.step8.assignment4;

import com.tw.step8.assignment4.exception.NoAvailableSpaceException;

public class Attendant {

	private final ParkingLots parkingLots;

	public Attendant(ParkingLots parkingLots) {
		this.parkingLots = parkingLots;
	}

	public Integer park(Integer lotID, Vehicle vehicle) throws NoAvailableSpaceException {
		ParkingLot parkingLot = this.parkingLots.getLot(lotID);
		//Add assistant to update parking lots status.
		return parkingLot.add(vehicle);
	}
}
