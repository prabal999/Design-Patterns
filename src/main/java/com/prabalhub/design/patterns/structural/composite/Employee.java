package com.prabalhub.design.patterns.structural.composite;

import java.util.List;

/**
 * @author Prabal Srivastava
 *
 */
public interface Employee {

	Employee add(Employee employee);

	Employee remove(Employee employee);

	List<Employee> getAll();

	String getDetails();
}
