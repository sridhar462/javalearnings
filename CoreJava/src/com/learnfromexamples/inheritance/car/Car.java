package com.learnfromexamples.inheritance.car;

public class Car extends Vehicle {
	private String musicSystem;

	/**
	 * @return the musicSystem
	 */
	public String getMusicSystem() {
		return musicSystem;
	}

	/**
	 * @param musicSystem the musicSystem to set
	 */
	public void setMusicSystem(String musicSystem) {
		this.musicSystem = musicSystem;
	}

	public void makeMusic() {
		System.out.println(musicSystem + " system makes Sound...");
	}

	@Override
	public void displayVehicle() {
		System.out.println("Car Model is :" + getModelYear());
		System.out.println("No of Wheels in the car is :" + getNoOfWheels());
		System.out.println("Music System is :" + getMusicSystem());
	}
}
