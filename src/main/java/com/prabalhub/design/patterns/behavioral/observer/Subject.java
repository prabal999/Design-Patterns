package com.prabalhub.design.patterns.behavioral.observer;

interface Subject {
	void subscribe(Observer observer);
	void unSubscribed(Observer observer);
	void notifyObserver(String message);
}
