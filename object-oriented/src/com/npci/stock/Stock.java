package com.npci.stock;
public class Stock implements Exchange {

	@Override
	public void getQuote() {
		System.out.println("Get Quote");
	}

	@Override
	public void viewQuote() {
		System.out.println("View Quote");
	}

	@Override
	public void setQuote() {
		System.out.println("Set Quote");
	}

}
