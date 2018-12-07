package com.learnfromexamples.constructor;

public class Lion extends Animal {
	private int noOfLegs;

	public Lion() {
		System.out.println("Lion Constructor");
	}

	public Lion(int noOfLegs) {
		super(noOfLegs);
		System.out.println("Lion Constructor with Args");
		this.noOfLegs = noOfLegs;
	}
	public void display() {
		System.out.println("No of Legs :"+noOfLegs);
	}
}
