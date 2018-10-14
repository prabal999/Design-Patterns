package com.prabalhub.design.patterns.creational.factory_method;

public class ShapeFactory {
	public static Shape getShape(final Type type) {
		Shape shape = null;
		switch (type) {
		case TRINGLE:
			shape = new Tringle();
			break;
		case CIRCLE:
			shape = new Circle();
			break;
		case SQUARE:
			shape = new Square();
		}
		return shape;
	}
}
