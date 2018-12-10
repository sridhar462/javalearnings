package com.learnfromexamples.inheritance.car;

public class Person {
	private String name;
	private Vehicle vehicle;

	
	/**
	 * @param name
	 * @param vehicle
	 */
	public Person(String name, Vehicle vehicle) {
		super();
		this.name = name;
		this.vehicle = vehicle;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the vehicle
	 */
	public Vehicle getVehicle() {
		return vehicle;
	}

	/**
	 * @param vehicle the vehicle to set
	 */
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public void showVehicleDetails() {
		vehicle.displayVehicle();
		if (vehicle instanceof Car) {
			Car car = (Car) vehicle;
			car.getMusicSystem();
		}
		if (vehicle instanceof Bike) {
			Car car = (Car) vehicle;
			car.getMusicSystem();
		}
	}
}
