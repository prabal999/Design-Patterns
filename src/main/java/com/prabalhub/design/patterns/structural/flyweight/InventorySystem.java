package com.prabalhub.design.patterns.structural.flyweight;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventorySystem {

	private final CatalogItemFactory catalog = new CatalogItemFactory();
	private final List<Order> orders = new CopyOnWriteArrayList<Order>();

	public void takeOrder(final String itemName, final int orderNumber) {
		Item item = catalog.lookUp(itemName);
		Order order = new Order(orderNumber, item);
		orders.add(order);
	}

	public void process() {
		for (Order order : orders) {
			order.processOrder();
			orders.remove(order);
		}
	}

	public String report() {
		return "Total numbers of item object created:" + catalog.totalItems();
	}
}
