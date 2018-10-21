package com.prabalhub.design.patterns.structural.decorator;

public class SimpleSandwich implements Sandwich {

	public String make() {
		return "Bread";
	}

	public int getCost() {
		return 10;
	}

}
