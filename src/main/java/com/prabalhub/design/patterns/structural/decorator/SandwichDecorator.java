package com.prabalhub.design.patterns.structural.decorator;

public abstract class SandwichDecorator implements Sandwich {
	protected Sandwich instance;
	
	public SandwichDecorator(final Sandwich instance) {
		this.instance = instance;
	}
	
	public String make() {
		return instance.make();
	}

	public int getCost() {
		return instance.getCost();
	}

}
