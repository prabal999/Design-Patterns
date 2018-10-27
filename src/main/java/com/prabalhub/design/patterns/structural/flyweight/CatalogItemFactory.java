package com.prabalhub.design.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

//Catalog acts as factory and cache for the Item flyweight objects.
public class CatalogItemFactory {

	private Map<String, Item> items = new HashMap<String, Item>();

	// Factory method
	public Item lookUp(String itemName) {
		if (!items.containsKey(itemName)) {
			items.put(itemName, new Item(99, itemName));
		}
		return items.get(itemName);
	}

	public int totalItems() {
		return items.size();
	}
}
