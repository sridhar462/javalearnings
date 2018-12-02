package com.learnfromexamples.helloworld;

public class IterationStatement {
	public static void main(String[] args) {
		System.out.println("whileIteration");
		whileIteration();
		System.out.println("doWhileIteration");
		doWhileIteration();
		System.out.println("forIteration");
		forIteration();
	}

	public static void whileIteration() {
		int numberOfPersons = 20;
		WelcomeMessage message = new WelcomeMessage();
		while (numberOfPersons > 0) {
			message.printMessgae(numberOfPersons);
			numberOfPersons--;
		}
	}

	public static void doWhileIteration() {
		int numberOfPersons = 20;
		WelcomeMessage message = new WelcomeMessage();
		do {
			message.printMessgae(numberOfPersons);
			numberOfPersons--;
		} while (numberOfPersons > 20);

	}

	public static void forIteration() {
		WelcomeMessage message = new WelcomeMessage();
		for (int numberOfPersons = 20; numberOfPersons > 0; numberOfPersons--) {
			message.printMessgae(numberOfPersons);
		}
	}
}

class WelcomeMessage {
	public void printMessgae(int numberofPersons) {
		System.out.println("Hello . Welocme to Core java Tutorial : " + numberofPersons);
	}
}
