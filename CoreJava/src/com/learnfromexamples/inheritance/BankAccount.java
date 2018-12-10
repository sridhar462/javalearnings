package com.learnfromexamples.inheritance;

public class BankAccount {

	private double withDrawAmount;

	private double depositAmount;

	private double interestRate;

	private double balance;

	public BankAccount() {
		this.interestRate = 9.5;
	}

	/**
	 * @return the withDrawAmount
	 */
	public double getWithDrawAmount() {
		return withDrawAmount;
	}

	/**
	 * @param withDrawAmount the withDrawAmount to set
	 */
	public void setWithDrawAmount(double withDrawAmount) {
		this.withDrawAmount = withDrawAmount;
	}

	/**
	 * @return the depositAmount
	 */
	public double getDepositAmount() {
		return depositAmount;
	}

	/**
	 * @param depositAmount the depositAmount to set
	 */
	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}

	/**
	 * @return the interestRate
	 */
	public double getInterestRate() {
		return interestRate;
	}

	/**
	 * @param interestRate the interestRate to set
	 */
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public void depositMoney() {
		System.out.println("Deposited Amount is : " + depositAmount);
		balance = balance + depositAmount;
	}

	public void withDrawMoney() {
		System.out.println("Withdraw Amount is : " + withDrawAmount);
		balance = depositAmount - withDrawAmount;
	}
}
