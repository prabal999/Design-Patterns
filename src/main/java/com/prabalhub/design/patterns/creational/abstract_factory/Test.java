package com.prabalhub.design.patterns.creational.abstract_factory;

public class Test {

	public static void main(String[] args) {
		GUIFactory factory = AbstractFactoryHelper.getFactory(Type.WIN);
		factory.getButton().rander();
		factory.getMenu().draw();
		
		factory = AbstractFactoryHelper.getFactory(Type.MAC);
		factory.getButton().rander();
		factory.getMenu().draw();
		
		factory = AbstractFactoryHelper.getFactory(Type.LINUX);
		factory.getButton().rander();
		factory.getMenu().draw();
	}

}
