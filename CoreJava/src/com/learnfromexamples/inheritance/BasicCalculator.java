package com.learnfromexamples.inheritance;

public class BasicCalculator {
	private int valueOne;
	private int valueTwo;

	public BasicCalculator() {

	}

	
	
	public BasicCalculator(int valueOne) {
		this.valueOne = valueOne;
	}
	/**
	 * @param valueOne
	 * @param valueTwo
	 */
	public BasicCalculator(int valueOne, int valueTwo) {
		this(valueOne);
		this.valueTwo = valueTwo;
	}

	/**
	 * @return the valueOne
	 */
	public int getValueOne() {
		return valueOne;
	}

	/**
	 * @return the valueTwo
	 */
	public int getValueTwo() {
		return valueTwo;
	}

	public long addition() {
		return valueOne + valueTwo;
	}

	public long subtraction() {
		return valueOne - valueTwo;
	}
}
