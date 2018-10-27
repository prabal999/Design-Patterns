package com.prabalhub.design.patterns.structural.flyweight;

public class Demo {

	public static void main(String[] args) {
		// JDK Example:
		Integer firstInt = Integer.valueOf(9);
		Integer secondInt = Integer.valueOf(9);
		Integer thirdInt = Integer.valueOf(3);

		System.out.println(System.identityHashCode(firstInt));
		System.out.println(System.identityHashCode(secondInt));
		System.out.println(System.identityHashCode(thirdInt));

		// Product Example:
		InventorySystem ims = new InventorySystem();

		ims.takeOrder("Moblie", 1);
		ims.takeOrder("Bottle", 2);
		ims.takeOrder("Milk", 3);
		ims.takeOrder("Bottle", 4);
		ims.takeOrder("Bottle", 5);
		ims.takeOrder("Moblie", 6);
		ims.takeOrder("Milk", 7);
		ims.takeOrder("Milk", 8);
		ims.takeOrder("Milk", 9);

		ims.process();

		System.out.println(ims.report());

	}

}
