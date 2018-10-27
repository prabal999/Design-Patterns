package com.prabalhub.design.patterns.structural.flyweight;

//Extrinsic object class.
public class Order {
	private final int orderNumber;
	private final Item item;
	
	public Order(final int orderNumber, final Item item) {
		this.orderNumber = orderNumber;
		this.item = item;
	}
	
	public void processOrder() {
		System.out.println("Ordering "+ item + "for order number:"+ orderNumber);
	}
}
