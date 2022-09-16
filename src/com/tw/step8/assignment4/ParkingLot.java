package com.tw.step8.assignment4;

import com.tw.step8.assignment4.exception.NoAvailableSpaceException;

import java.util.ArrayList;

public class ParkingLot {

	protected final int ID;
	private final ArrayList<Vehicle> spaces;
	protected final int capacity;

	public ParkingLot(int ID, int capacity) {
		this.ID = ID;
		this.spaces = new ArrayList<>(capacity);
		this.capacity = capacity;
	}

	public Integer add(Vehicle vehicle) throws NoAvailableSpaceException {
		if (this.isFull()) {
			throw new NoAvailableSpaceException(this.ID);
		}

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
