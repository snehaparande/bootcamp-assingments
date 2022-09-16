package com.tw.step8.assignment4;

import java.util.ArrayList;

public class ParkingLot {

	private final int ID;
	private final ArrayList<Vehicle> spaces;
	private final int capacity;

	public ParkingLot(int ID, int capacity) {
		this.ID = ID;
		this.spaces = new ArrayList<>(capacity);
		this.capacity = capacity;
	}

	public Integer park(Vehicle vehicle) {
		this.spaces.add(vehicle);
		return newToken();
	}

	private Integer newToken() {
		return this.spaces.size();
	}

	public boolean isFull() {
		return this.spaces.size() == this.capacity;
	}

	public boolean canTraineeHandle() {
		return this.currentCapacityPercent() < 80;
	}

	private int currentCapacityPercent() {
		return (this.spaces.size() * 100) / this.capacity;
	}
}
