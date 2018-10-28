package com.prabalhub.design.patterns.structural.proxy;

public class Client {

	public static void main(String[] args) throws IllegalAccessException {
		InternetSubject proxyInternet = new ProxyInternetSubjectImpl();
		proxyInternet.connect("prabalhub.com");
		proxyInternet.connect("abc.com");
	}

}
