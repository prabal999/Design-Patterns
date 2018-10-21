package com.prabalhub.design.patterns.structural.decorator;

public class VagSandwichDecorator extends SandwichDecorator {

	public VagSandwichDecorator(Sandwich instance) {
		super(instance);
	}
	
	@Override
	public String make() {
		return super.make() + addCucumber();
	}

	@Override
	public int getCost() {
		return super.getCost() + 10;
	}
	
	private String addCucumber() {
		return " + Cucumber";
	}

}
