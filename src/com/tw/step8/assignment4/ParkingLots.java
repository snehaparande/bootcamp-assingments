package com.tw.step8.assignment4;

import com.tw.step8.assignment4.exception.InvalidLotCapacityException;

import java.util.ArrayList;

public class ParkingLots {
	ArrayList<ParkingLot> lots;
	public ParkingLots() {
		this.lots = new ArrayList<>();
	}

	public void addLot(Integer capacity) throws InvalidLotCapacityException {
		if (capacity <= 0) {
			throw new InvalidLotCapacityException(capacity);
		}

		int currentLotID = this.lots.size();
		this.lots.add(new ParkingLot(currentLotID,capacity));
	}

	public ParkingLot getLot(Integer lotID) {
		return this.lots.get(lotID);
	}
}
