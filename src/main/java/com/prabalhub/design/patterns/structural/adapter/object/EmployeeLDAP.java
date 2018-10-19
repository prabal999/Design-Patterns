package com.prabalhub.design.patterns.structural.adapter.object;
/**
 * Adaptee 1
 * @author Prabal Srivastava
 *
 */
public class EmployeeLDAP {
	
	private String cn;
	private String surname;
	private String givenname;
	private String mail;
	
	public EmployeeLDAP(String cn, String surname, String givenname, String mail) {
		super();
		this.cn = cn;
		this.surname = surname;
		this.givenname = givenname;
		this.mail = mail;
	}
	public String getCn() {
		return cn;
	}
	public void setCn(String cn) {
		this.cn = cn;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getGivenname() {
		return givenname;
	}
	public void setGivenname(String givenname) {
		this.givenname = givenname;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
}
