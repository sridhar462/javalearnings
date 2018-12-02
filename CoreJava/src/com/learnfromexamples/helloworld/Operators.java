package com.learnfromexamples.helloworld;

public class Operators {
	public void arithmeticOperator() {
		int a = 10;
		int b = 5;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
	}

	public void relationalOperator() {
		int a = 10;
		int b = 5;
		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a < b);
		System.out.println(a <= b);
		System.out.println(a == b);
		System.out.println(a != b);
	}

	public void unaryOperator() {
		int x = 5;
		System.out.println(x++);// 5 (6)
		System.out.println(++x);// 7
		System.out.println(x--);// 7 (6)
		System.out.println(--x);// 5
	}

	public void logicalOperator() {
		int a = 5;
		int b = 10;

		System.out.println(a > 6 && b < 8);
		System.out.println(a > 6 || b < 8);
		System.out.println(!(a > 6));
	}

	public void bitwiseOperator() {
		int a = 15; // (0000 1111)
		int b = 5; // (0000 0101)
		int c = a & b; // if both operands bits are 1 returns 1 else 0;
		System.out.println(c); // (0000 0101)
		c = a | b; // if operand bits are 1 returns 1 else 0;
		System.out.println(c); // (0000 1111)
		c = ~b; // 2's complement
		System.out.println(c);
		c = a ^ b; // if both bits are not same 1 else 0
		System.out.println(c);
	}

	public void assignmentOperator() {
		int a = 15;
		int b = 6;
		b += a; // b= b+a;
		System.out.println(b);
		b -= a; // b= b-a;
		System.out.println(b);
	}

	public void operatorPrecedence() {
		// 1 -> ().[]
		// 2 -> ++,--
		// 3 -> *,/,%,+,-
		// 4 -> <.<=,>,>=
		// 5 -> ==,!=
		// 6 -> &&,||
		int a = 5;
		int b = 10;
		int c = 40;
		int d = 20;
		int result = (a * b) + c / d;
		System.out.println(result);
	}

	public static void main(String[] args) {
		Operators operators = new Operators();
		System.out.println("unaryOperator");
		operators.unaryOperator();
		System.out.println("arithmeticOperator");
		operators.arithmeticOperator();

		System.out.println("relationalOperator");
		operators.relationalOperator();
		System.out.println("logicalOperator");
		operators.logicalOperator();
		System.out.println("bitwiseOperator");
		operators.bitwiseOperator();

		System.out.println("assignmentOperator");
		operators.assignmentOperator();
		
		System.out.println("operatorPrecedence");
		operators.operatorPrecedence();
	}
}
