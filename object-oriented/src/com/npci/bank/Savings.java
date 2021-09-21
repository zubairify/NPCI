package com.npci.bank;

public class Savings extends Accounts {

	public Savings() {
		super();
	}

	public Savings(String holder) {
		super(holder, MIN_SAVINGS_BAL);
		// Adding the first transaction of opening balance
		txns[idx ++] = new Transaction("OB", balance, balance);
	}

	@Override
	public void withdraw(double amount) throws BalanceException {
		if(amount <= (getBalance() - MIN_SAVINGS_BAL)) {
			balance -= amount;
			txns[idx ++] = new Transaction("DR", amount, balance);
		} else
			throw new BalanceException("Insufficient balance!");
	}
	
}
