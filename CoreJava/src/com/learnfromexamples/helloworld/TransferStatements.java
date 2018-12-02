package com.learnfromexamples.helloworld;

public class TransferStatements {

	public static void main(String[] args) {
		System.out.println("forIteration");
		forIteration();
		System.out.println("After Iteration");
	}

	public static void forIteration() {
		Greeting emp = new Greeting();
		for (int numberOfPersons = 1; numberOfPersons <20 ; numberOfPersons++) {
			if (numberOfPersons == 10) {
				break;
			}
			emp.printMessgae(numberOfPersons);
		}
		System.out.println("After Iteration in T Statement");
	}
}
class Greeting{
	public void printMessgae(int numberofPersons) {
		System.out.println("Hello . Welocme to Core java Tutorial : " + numberofPersons);
	}
}