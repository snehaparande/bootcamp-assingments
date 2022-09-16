package com.tw.step8.assignment4;

import java.util.ArrayList;

public class ParkingLot {

	private final ArrayList<Vehicle> spaces;

	public ParkingLot(int lotLimit) {
		this.spaces = new ArrayList<>(lotLimit);
	}

	public Integer park(Vehicle vehicle) {
		this.spaces.add(vehicle);
		return newToken();
	}

	private Integer newToken() {
		return this.spaces.size();
	}

	public boolean isFull() {
		return true;
	}
}
