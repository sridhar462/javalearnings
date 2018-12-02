package com.learnfromexamples.accessspecfiers;

public class FBprofile {
	private int age;
	public String school;
	protected String employerName;
	String emailId;

	/**
	 * @return the age
	 */
	private int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	private void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the school
	 */
	public String getSchool() {
		return school;
	}

	/**
	 * @param school the school to set
	 */
	public void setSchool(String school) {
		this.school = school;
	}

	/**
	 * @return the employerName
	 */
	protected String getEmployerName() {
		return employerName;
	}

	/**
	 * @param employerName the employerName to set
	 */
	protected void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	/**
	 * @return the emailId
	 */
	String getEmailId() {
		return emailId;
	}

	/**
	 * @param emailId the emailId to set
	 */
	void setEmailId(String emailId) {
		this.emailId = emailId;
	}

}
