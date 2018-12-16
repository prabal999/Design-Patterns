package com.prabalhub.design.patterns.behavioral.memento;

//Memento
public class EmployeeMemento {

	private String id;
	private String name;
	
	public EmployeeMemento(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
}
