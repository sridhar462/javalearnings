package com.learnfromexamples.constructor;

import java.util.Date;

public class Employee {
	String empName;
	String empID;
	public Employee() {
		this(createRandomID());
	}

	public Employee(String empID) {
		super();
		this.empID = empID;
	}

	public static String createRandomID() {
		
		return new Date().toString() ;
	}
	
	public void display() {
		System.out.println(empID);
		System.out.println(empName);
	}
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.display();
	}
}
