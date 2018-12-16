package com.prabalhub.design.patterns.behavioral.memento;

import java.util.Stack;

public class EmployeeCareTaker {
	private Stack<EmployeeMemento> careTaker = new Stack<>();
	
	public void save(EmployeeOriginator originator) {
		careTaker.push(originator.save());
	}
	
	public void undo(EmployeeOriginator originator) {
		originator.undo(careTaker.pop());
	}
}
