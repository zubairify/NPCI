package com.npci.bank;

public final class AccountsFactory {
	
	private AccountsFactory() {
	}
	
	public static Bank openAccount(String holder, String type) {
		Bank b = null;
		
		if(type.equalsIgnoreCase("savings"))
			b = new Savings(holder);
		else
			b = new Current(holder);
		
		return b;
	}
}
