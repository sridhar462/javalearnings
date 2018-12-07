package com.learnfromexamples.constructor;

public class HexEmployee {
	int empId;

	public HexEmployee() {
		System.out.println("No Arg Constructor");
	}

	public HexEmployee(int empId) {
		System.out.println("No Arg Constructor");
		this.empId = empId;
	}

	public void display() {
		System.out.println("Emp id is " + empId);
	}

	public static void main(String[] args) {
		HexEmployee constructor = new HexEmployee(7);
		constructor.display();
	}
}
