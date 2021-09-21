package com.npci.bank;

public abstract class AbstractAccountsFactory {

	public abstract Accounts openAccount(String holder);
}
