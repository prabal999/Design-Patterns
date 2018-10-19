package com.prabalhub.design.patterns.structural.adapter.object;

public class EmployeeCSVAdapter implements Employee {
	
	private EmployeeCSV instance;
	
	public EmployeeCSVAdapter(final EmployeeCSV instance) {
		this.instance = instance;
	}
	public String getId() {
		return String.valueOf(instance.getId());
	}

	public String getFirstName() {
		return instance.getName();
	}

	public String getLastName() {
		return instance.getLast();
	}

	public String getEmail() {
		return instance.getEmailAddress();
	}

}
