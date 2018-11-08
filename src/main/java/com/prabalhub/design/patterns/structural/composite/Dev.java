package com.prabalhub.design.patterns.structural.composite;

import java.util.List;

/**
 * @author Prabal Srivastava
 *
 */
public class Dev implements Employee {
	private String id;
	private String name;
	private String salary;

	public Dev(String id, String name, String salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.prabalhub.design.patterns.structural.composite.Employee#add(com.prabalhub
	 * .design.patterns.structural.composite.Employee)
	 */
	public Employee add(Employee employee) throws IllegalStateException {
		throw new IllegalStateException("Not suppoted!");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.prabalhub.design.patterns.structural.composite.Employee#remove(com.
	 * prabalhub.design.patterns.structural.composite.Employee)
	 */
	public Employee remove(Employee employee) throws IllegalStateException {
		throw new IllegalStateException("Not suppoted!");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.prabalhub.design.patterns.structural.composite.Employee#getAll()
	 */
	public List<Employee> getAll() throws IllegalStateException {
		throw new IllegalStateException("Not suppoted!");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.prabalhub.design.patterns.structural.composite.Employee#getDetails()
	 */
	public String getDetails() {
		return "ID: " + id + "\tName:" + name + "\t Salary" + salary;
	}
}
