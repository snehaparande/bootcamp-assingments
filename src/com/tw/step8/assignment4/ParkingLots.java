package com.tw.step8.assignment4;

import com.tw.step8.assignment4.exception.InvalidLotCapacityException;

import java.util.ArrayList;

public class ParkingLots {
	ArrayList<ParkingLot> lots;
	Assistant assistant;
	public ParkingLots() {
		this.assistant = new Assistant();
		this.lots = new ArrayList<>();
	}

	public void addLot(Integer capacity) throws InvalidLotCapacityException {
		if (capacity <= 0) {
			throw new InvalidLotCapacityException(capacity);
		}

		int currentLotID = this.lots.size();
		this.lots.add(new ParkingLot(currentLotID,capacity));
	}
}
