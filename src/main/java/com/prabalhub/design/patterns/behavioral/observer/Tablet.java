package com.prabalhub.design.patterns.behavioral.observer;

public class Tablet implements Observer {

	@Override
	public void update(String message) {
		System.out.println("NEWS update on tablet agent:" + message);
	}

}
