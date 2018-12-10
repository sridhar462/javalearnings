package com.learnfromexamples.inheritance;

public class NRIAccount extends BankAccount {
	public void applyFixedDeposit() {
		this.setInterestRate(10.5);
	}
}
