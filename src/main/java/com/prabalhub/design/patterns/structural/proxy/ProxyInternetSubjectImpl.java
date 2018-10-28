package com.prabalhub.design.patterns.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternetSubjectImpl implements InternetSubject {

	private InternetSubject internet = new InternetSubjectImpl();
	private static List<String> bannedSites;

	static {
		bannedSites = new ArrayList<String>();
		bannedSites.add("abc.com");
		bannedSites.add("xyz.com");
	}

	public void connect(String webSite) throws IllegalAccessException {
		if (bannedSites.contains(webSite.toLowerCase())) {
			throw new IllegalAccessException("Access Denied");
		}

		internet.connect(webSite);
	}

}
