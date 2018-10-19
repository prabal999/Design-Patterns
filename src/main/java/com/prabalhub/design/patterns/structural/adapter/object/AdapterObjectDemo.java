package com.prabalhub.design.patterns.structural.adapter.object;

import java.util.List;

public class AdapterObjectDemo {

	public static void main(String[] args) {
		EmployeeClient client = new EmployeeClient();
		List<Employee> employees = client.getEmployees();
		System.out.println(employees);
	}

}
