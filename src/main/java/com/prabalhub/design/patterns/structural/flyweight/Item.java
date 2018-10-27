package com.prabalhub.design.patterns.structural.flyweight;

//instance of Item will be  Flyweight.(Imutable) Intrinsic object class.
public class Item {

	private final int id;
	private final String name;

	public Item(final int id, final String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + "]";
	}
}
