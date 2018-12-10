package com.learnfromexamples.inheritance.car;

public class InheritanceDemo {

	public static void main(String[] args) {
		/*Car car = new Car();
		car.setModelYear(2018);
		car.setNoOfWheels(4);
		car.setMusicSystem("Sony");
		
		car.displayVehicle();
		car.makeMusic();

		Bike bike = new Bike();
		bike.setModelYear(2017);
		bike.setNoOfWheels(2);
		bike.setKickStart(true);

		bike.displayVehicle();
		bike.startBike();*/
		
		Vehicle car = new Car();
		car.setModelYear(2018);
		car.setNoOfWheels(4);
		//car.setMusicSystem("Sony");
		
		car.displayVehicle();
	//	car.makeMusic();

		Vehicle bike = new Bike();
		bike.setModelYear(2017);
		bike.setNoOfWheels(2);
	//	bike.setKickStart(true);

		bike.displayVehicle();
	//	bike.startBike();
	}

}
