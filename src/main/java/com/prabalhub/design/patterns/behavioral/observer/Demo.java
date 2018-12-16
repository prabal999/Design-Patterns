package com.prabalhub.design.patterns.behavioral.observer;

public class Demo {

	public static void main(String[] args) {
		Subject newsFeed = new TOI();
		newsFeed.subscribe(new Tablet());
		newsFeed.subscribe(new Mobile());
		newsFeed.notifyObserver("Modi slams on UPA for rafal deal.");
	}

}
