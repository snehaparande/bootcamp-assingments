package com.tw.step8.assignment4;

import com.tw.step8.assignment4.exception.NoAvailableSpaceException;

import java.util.ArrayList;

public class ParkingLot {

	protected final int ID;
	private final ArrayList<Vehicle> spaces;
	protected final int capacity;
	protected LotStatus status;

	public ParkingLot(int ID, int capacity, Notifier notifier) {
		this.ID = ID;
		this.spaces = new ArrayList<>(capacity);
		this.capacity = capacity;
		this.status = LotStatus.PROMOTABLE;
	}

	public Integer add(Vehicle vehicle) throws NoAvailableSpaceException {
		if (this.isFull()) {
			throw new NoAvailableSpaceException(this.ID);
		}

		this.spaces.add(vehicle);
		this.updateStatus();
		return newToken();
	}

	private void updateStatus() {
		int currentCapacity = currentCapacityPercent();

		if (currentCapacity < 20) return;
		if (currentCapacity < 80 ) {
			this.status = LotStatus.TRAINEE_HANDLEABLE;
			return;
		};

		this.status = LotStatus.TAXABLE;
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
