package com.prabalhub.design.patterns.structural.adapter.object;

public class EmployeeLDAPAdapter implements Employee {
	private EmployeeLDAP instance;
	
	public EmployeeLDAPAdapter(final EmployeeLDAP instance) {
		this.instance = instance;
	}
	
	public String getId() {
		return instance.getCn();
	}

	public String getFirstName() {
		return instance.getGivenname();
	}

	public String getLastName() {
		return instance.getSurname();
	}

	public String getEmail() {
		return instance.getMail();
	}

}
