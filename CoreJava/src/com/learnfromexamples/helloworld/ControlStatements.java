package com.learnfromexamples.helloworld;

public class ControlStatements {

	public static void main(String[] args) {
		Student student = new Student();
		student.studentAddress = "Chennai";
		student.studentAge = 21;
		student.studentId = 1;
		student.studentMarks = 1;
		if (student.studentAge > 18) {
			System.out.println("Can Vote");
		}

		System.out.println("After If");

		if (student.studentAge > 18) {
			System.out.println("Can Vote");
		} else {
			System.out.println("Can't Vote");
		}
		System.out.println("After Else If");

		if (student.studentMarks > 90) {
			System.out.println("Grade 'A'");
		} else if (student.studentMarks > 80 && student.studentMarks < 90) {
			System.out.println("Grade 'B'");
		} else if (student.studentMarks > 70 && student.studentMarks < 80) {
			System.out.println("Grade 'C'");
		} else if (student.studentMarks > 60 && student.studentMarks < 70) {
			System.out.println("Grade 'D'");
		} else if (student.studentMarks > 50 && student.studentMarks < 60) {
			System.out.println("Grade 'D'");
		} else {
			System.out.println("Fail");
		}

		//byte, short, int, long, enum types, String 
		System.out.println(getMonth(9));
	}

	public static String getMonth(int month) {
		String monthString = null;
		switch (month) {
		case 1:
			monthString = "1 - January";
			break;
		case 2:
			monthString = "2 - February";
			break;
		case 3:
			monthString = "3 - March";
			break;
		case 4:
			monthString = "4 - April";
			break;
		case 5:
			monthString = "5 - May";
			break;
		case 6:
			monthString = "6 - June";
			break;
		case 7:
			monthString = "7 - July";
			break;
		case 8:
			monthString = "8 - August";
			break;
		case 9:
			monthString = "9 - September";
			break;
		case 10:
			monthString = "10 - October";
			break;
		case 11:
			monthString = "11 - November";
			break;
		case 12:
			monthString = "12 - December";
			break;
		default:
			System.out.println("Invalid Month!");
		}
		return monthString;
	}

}
