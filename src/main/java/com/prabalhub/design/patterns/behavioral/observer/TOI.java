package com.prabalhub.design.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class TOI implements Subject {
	List<Observer> subscribe = new ArrayList<>();
	
	@Override
	public void subscribe(Observer observer) {
		subscribe.add(observer);
	}

	@Override
	public void unSubscribed(Observer observer) {
		subscribe.remove(observer);
	}

	@Override
	public void notifyObserver(String news) {
		for (Observer observer : subscribe) {
			observer.update(news);
		}
	}

}
