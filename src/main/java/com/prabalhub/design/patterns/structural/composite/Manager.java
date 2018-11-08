package com.prabalhub.design.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Prabal Srivastava
 *
 */
public class Manager implements Employee {
	private String id;
	private String name;
	private String salary;
	private List<Employee> employees = new ArrayList<Employee>();

	public Manager(String id, String name, String salary) {
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
	public Employee add(Employee employee) {
		if (null != employee) {
			employees.add(employee);
		}
		return employee;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.prabalhub.design.patterns.structural.composite.Employee#remove(com.
	 * prabalhub.design.patterns.structural.composite.Employee)
	 */
	public Employee remove(Employee employee) {
		if (null != employee) {
			employees.remove(employee);
		}
		return employee;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.prabalhub.design.patterns.structural.composite.Employee#getAll()
	 */
	public List<Employee> getAll() {
		return employees;
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
