package com.npci.bank;

public interface Bank {

	void summary();
	double getBalance();
	void deposit(double amount);
	void withdraw(double amount) throws BalanceException;
	void statement();
	
	int INIT_ACNT_NO = 12001;
	double MIN_SAVINGS_BAL = 1000;
	double INIT_CURRENT_BAL = 5000;
	double MIN_CURRENT_BAL = 0;
	double OVERDRAFT_LIMIT = 10000;
}
