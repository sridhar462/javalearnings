package com.learnfromexamples.helloworld;

public class Casting {
	public static void main(String[] args) {
		int a = 7;
		float b = a;

		System.out.println("Value of 'a' is " + a);
		System.out.println("Value of 'b' is " + b);

		float b1 = 3.14f;
		int a1 = (int) b1;

		System.out.println("Value of 'b1' is " + b1);
		System.out.println("Value of 'a1' is " + a1);

	}
}
