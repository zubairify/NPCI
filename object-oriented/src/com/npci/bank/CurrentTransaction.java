package com.npci.bank;

public class CurrentTransaction extends Transaction {
	private double overdraft;

	public CurrentTransaction() {
		super();
	}

	public CurrentTransaction(String type, double amount, double balance, double overdraft) {
		super(type, amount, balance);
		this.overdraft = overdraft;
	}

	@Override
	public String toString() {
		return super.toString() + "\t" + overdraft;
	}
}
