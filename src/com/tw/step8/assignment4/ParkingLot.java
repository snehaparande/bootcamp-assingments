package com.tw.step8.assignment4;

import java.util.ArrayList;

public class ParkingLot {

	private final ArrayList<Vehicle> spaces;
	private final int lotLimit;

	public ParkingLot(int lotLimit) {
		this.spaces = new ArrayList<>(lotLimit);
		this.lotLimit = lotLimit;
	}

	public Integer park(Vehicle vehicle) {
		this.spaces.add(vehicle);
		return newToken();
	}

	private Integer newToken() {
		return this.spaces.size();
	}

	public boolean isFull() {
		return this.spaces.size() == this.lotLimit;
	}
}
