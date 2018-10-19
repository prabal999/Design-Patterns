package com.prabalhub.design.patterns.structural.adapter.object;

import java.util.ArrayList;
import java.util.List;

/**
 * Employee client.
 * @author Prabal Srivastava
 *
 */
public class EmployeeClient {
	public List<Employee> getEmployees(){
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new EmployeeDB("1","Prabal", "Srivatava", "prabal9@live.com"));
		EmployeeLDAP employeeLDAP = new EmployeeLDAP("2", "Anand", "Singh", "sp4@gmail.com");
		employees.add(new EmployeeLDAPAdapter(employeeLDAP));
		EmployeeCSV employeeCSV = new EmployeeCSV("3, Anshu, Gupta, anshu.gupta@gmail.com");
		employees.add(new EmployeeCSVAdapter(employeeCSV));
		return employees;
	}
}
