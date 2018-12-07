package com.learnfromexamples.constructor;

public class Animal {
	private int noOfLegs;
	public static int noOfEyes = 2;
	public Animal() {
		System.out.println("Animal Constructor");
	}
	public Animal(int noOfLegs) {
		System.out.println("Animal Constructor with constructor");
		this.noOfLegs = noOfLegs;
	}
}	
