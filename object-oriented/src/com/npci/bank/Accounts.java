package com.npci.bank;

import java.util.ArrayList;

/**
 * This class represents generalised bank account.
 * @author Zubair Shaikh
 * @version 1.0
 */
public abstract class Accounts implements Bank {
	private int acntNo;
	private String holder;
	protected double balance;
	
	protected ArrayList<Transaction> txns;
	
	private static int autogen = INIT_ACNT_NO;
	
	/** Default constructor */
	public Accounts() {
	}

	/**
	 * Parameterised constructor
	 * @param holder
	 * @param balance
	 */
	public Accounts(String holder, double balance) {
		this.acntNo = autogen ++;
		this.holder = holder;
		this.balance = balance;
		txns = new ArrayList<Transaction>();
	}
	
	public void summary() {
		System.out.println("A/C No: " + acntNo);
		System.out.println("Holder: " + holder);
		System.out.println("Balance: " + balance);
	}
	
	public void deposit(double amount) {
		balance += amount;
		txns.add(new Transaction("CR", amount, balance));
	}

	public double getBalance() {
		return balance;
	}
	
	public void statement() {
		System.out.println("Statement of A/C No: " + acntNo);
		for(Transaction t : txns) 
			System.out.println(t);
	}
}
