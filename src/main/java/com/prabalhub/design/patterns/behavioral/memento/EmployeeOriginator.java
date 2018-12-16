package com.prabalhub.design.patterns.behavioral.memento;

import java.io.Serializable;

//Originator
public class EmployeeOriginator implements Serializable {

	private static final long serialVersionUID = 4409173174369146480L;
	private String id;
	private String name;

	public EmployeeOriginator(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public EmployeeMemento save() {
		return new EmployeeMemento(id, name);
	}
	
	public void undo(EmployeeMemento memento) {
		setId(memento.getId());
		setName(memento.getName());
	}

	@Override
	public String toString() {
		return "EmployeeOriginator [id=" + id + ", name=" + name + "]";
	}
}
