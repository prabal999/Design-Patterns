package com.prabalhub.design.patterns.behavioral.chain;

public class Request {
	private double amount;

	public Request(double amount) {
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}
	
	@Override
	public String toString() {
		return String.valueOf(amount);
	}

}
