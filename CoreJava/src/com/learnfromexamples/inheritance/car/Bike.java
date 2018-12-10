package com.learnfromexamples.inheritance.car;

public class Bike extends Vehicle {
	boolean isKickStart;

	/**
	 * @return the isKickStart
	 */
	public boolean isKickStart() {
		return isKickStart;
	}

	/**
	 * @param isKickStart the isKickStart to set
	 */
	public void setKickStart(boolean isKickStart) {
		this.isKickStart = isKickStart;
	}

	public void startBike() {
		if (isKickStart) {
			System.out.println("Bike doesn't have a kickStart option...");
		} else {
			System.out.println("Bike has a kickStart option...");
		}
	}

	@Override
	public void displayVehicle() {
		/*
		 * System.out.println("Bike Model is :" + getModelYear());
		 * System.out.println("No of Wheels in the bike is :" + getNoOfWheels());
		 */
		System.out.println("Bike is having kick start " + isKickStart());
		super.displayVehicle();
	}
}
