package com.prabalhub.design.patterns.behavioral.observer;

public class Mobile implements Observer {

	@Override
	public void update(String message) {
		System.out.println("NEWS update on mobile agent:" + message);
	}

}
