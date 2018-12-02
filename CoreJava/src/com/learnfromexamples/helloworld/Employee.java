package com.learnfromexamples.helloworld;

public class Employee {
	int empId;
	String empName;
	String empAddress;
	String mobileNumber;

	void printEmployeeDetails() {
		System.out.println("Emp id is :" + empId);
		System.out.println("Emp Name is :" + empName);
		System.out.println("Employee Address is :" + empAddress);
		System.out.println("Mobile Number  is :" + mobileNumber);
	}

}
/*public static void main(String[] args) {
		Employee employee = new Employee();
		employee.empId = 6;
		employee.empName = "Sridhar";
		employee.empAddress = "Chennai";
		employee.mobileNumber = "123456789";
		employee.printEmployeeDetails();
	
	}*/
