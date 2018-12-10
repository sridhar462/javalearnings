package com.learnfromexamples.inheritance.car;

public class Vehicle {
	private int noOfWheels;
	private long modelYear;

	/**
	 * @return the noOfWheels
	 */
	public int getNoOfWheels() {
		return noOfWheels;
	}

	/**
	 * @param noOfWheels the noOfWheels to set
	 */
	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	/**
	 * @return the modelYear
	 */
	public long getModelYear() {
		return modelYear;
	}

	/**
	 * @param modelYear the modelYear to set
	 */
	public void setModelYear(long modelYear) {
		this.modelYear = modelYear;
	}

	public void displayVehicle() {
		System.out.println("Vehicle Model is : " + modelYear);
		System.out.println("No of Wheels are : " + noOfWheels);
	}
}
