package com.prabalhub.design.patterns.structural.decorator;

public class MustardSandwichDecorator extends SandwichDecorator {

	public MustardSandwichDecorator(Sandwich instance) {
		super(instance);
	}

	@Override
	public String make() {
		return super.make() + addMustard();
	}

	@Override
	public int getCost() {
		return super.getCost() + 7;
	}

	private String addMustard() {
		return " + Mustard";
	}
}
