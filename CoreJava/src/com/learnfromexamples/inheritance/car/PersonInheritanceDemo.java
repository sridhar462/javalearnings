package com.learnfromexamples.inheritance.car;

public class PersonInheritanceDemo {

	public static void main(String[] args) {
		Car car = new Car();
		car.setModelYear(2018);
		car.setMusicSystem("JBL");
		car.setNoOfWheels(4);
		Person person = new Person("Sridhar", car);
		person.showVehicleDetails();
	}

}
