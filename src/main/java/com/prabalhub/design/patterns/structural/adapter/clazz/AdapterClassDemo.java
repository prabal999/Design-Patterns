package com.prabalhub.design.patterns.structural.adapter.clazz;

import java.util.List;

public class AdapterClassDemo {

	public static void main(String[] args) {
		EmployeeClient client = new EmployeeClient();
		List<Employee> employees = client.getEmployees();
		System.out.println(employees);
	}

}
