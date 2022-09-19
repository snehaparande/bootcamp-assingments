package com.tw.step8.assignment4;

import java.util.ArrayList;

public class Assistant {

	private final ParkingLots parkingLots;

	public Assistant(ParkingLots parkingLots) {
		this.parkingLots = parkingLots;
	}

	public String display() {
		ArrayList<ParkingLot> allLots = parkingLots.lots;
		StringBuilder allLotsStatus = new StringBuilder();

		for (ParkingLot lot : allLots) {
			String status = String.format("ID: %d\n-------\nCapacity: %d", lot.ID, lot.capacity);
			allLotsStatus.append(status);
		}

		return allLotsStatus.toString();
	}
}
