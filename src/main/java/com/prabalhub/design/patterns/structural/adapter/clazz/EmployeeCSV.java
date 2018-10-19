package com.prabalhub.design.patterns.structural.adapter.clazz;

import java.util.StringTokenizer;

/**
 * Adaptee 2
 * 
 * @author Prabal Srivastava
 *
 */
public class EmployeeCSV implements Employee{

	private int idCsv;
	private String name;
	private String last;
	private String emailAddress;

	public EmployeeCSV(final String csvData) {
		StringTokenizer tokenizer = new StringTokenizer(csvData, ",");
		if (tokenizer.hasMoreTokens()) {
			idCsv = Integer.parseInt(tokenizer.nextToken());
		}
		if (tokenizer.hasMoreTokens()) {
			name = tokenizer.nextToken();
		}
		if (tokenizer.hasMoreTokens()) {
			last = tokenizer.nextToken();
		}
		if (tokenizer.hasMoreTokens()) {
			emailAddress = tokenizer.nextToken();
		}
		
	}

	public int getIdCsv() {
		return idCsv;
	}

	public void setIdCsv(int idCsv) {
		this.idCsv = idCsv;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getId() {
		return String.valueOf(idCsv);
	}

	public String getFirstName() {
		return name;
	}

	public String getLastName() {
		return last;
	}

	public String getEmail() {
		return emailAddress;
	}

}
