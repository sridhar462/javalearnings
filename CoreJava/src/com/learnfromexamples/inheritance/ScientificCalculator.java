package com.learnfromexamples.inheritance;

public class ScientificCalculator extends BasicCalculator {

	
	
	public ScientificCalculator() {
		// TODO Auto-generated constructor stub
	}
	
	public ScientificCalculator(int valueOne) {
		super(valueOne);
	}
	
 	public ScientificCalculator(int valueOne, int valueTwo) {
		super(valueOne, valueTwo);
	}

 	public double calculateSineValue() {
		return Math.sin(getValueOne());
 	}
 	
 	public double calculateCosValue() {
 		return Math.cos(getValueOne());
 	}
}
