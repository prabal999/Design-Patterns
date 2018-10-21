package com.prabalhub.design.patterns.structural.decorator;

public class DecoratorDemo {

	public static void main(String... strings) {
		Sandwich vagMustardSandwich = new MustardSandwichDecorator(new VagSandwichDecorator(new SimpleSandwich()));
		System.out.println("Sandwich: " + vagMustardSandwich.make() + "\ncost: " + vagMustardSandwich.getCost());
	}
}
