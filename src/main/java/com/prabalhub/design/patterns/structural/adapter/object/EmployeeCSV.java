package com.prabalhub.design.patterns.structural.adapter.object;

import java.util.StringTokenizer;

/**
 * Adaptee 2
 * 
 * @author Prabal Srivastava
 *
 */
public class EmployeeCSV {

	private int id;
	private String name;
	private String last;
	private String emailAddress;

	public EmployeeCSV(final String csvData) {
		StringTokenizer tokenizer = new StringTokenizer(csvData, ",");
		if (tokenizer.hasMoreTokens()) {
			id = Integer.parseInt(tokenizer.nextToken());
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

}
