package com.prabalhub.design.patterns.structural.proxy;

public class InternetSubjectImpl implements InternetSubject {

	public void connect(final String webSite) {
		System.out.println("Connecting to "+ webSite);
	}

}
