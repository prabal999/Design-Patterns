package com.prabalhub.design.patterns.creational.factory_method;

public class TestFactoryMethod {

	public static void main(String[] args) {
		Shape shape = ShapeFactory.getShape(Type.SQUARE);
		shape.draw();
		shape = ShapeFactory.getShape(Type.CIRCLE);
		shape.draw();
		shape = ShapeFactory.getShape(Type.TRINGLE);
		shape.draw();
	}

}
