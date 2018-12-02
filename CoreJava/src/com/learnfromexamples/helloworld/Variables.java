package com.learnfromexamples.helloworld;

public class Variables {

	int a = 10;

	static int b = 20;

	public void localVariable() {
		int local = 30;
		System.out.println("Value of 'local' is " + local);
	}

	public void accessLocalVariable() {
		a = 90;
		b = 100;
	}

	public static void main(String[] args) {
		Variables variables = new Variables();
		System.out.println("Value of 'a' is " + variables.a);
		System.out.println("Value of 'b' is " + b);
		variables.localVariable();
		/*variables.accessLocalVariable();
		System.out.println("Value of 'a' after changing is " + variables.a);
		System.out.println("Value of 'b' after changing is " + b);
		
		System.out.println("-------------");
		Variables variables1 = new Variables();
		System.out.println("Value of 'a' is " + variables1.a);
		System.out.println("Value of 'b' is " + b);
		variables1.localVariable();*/
	}

}
