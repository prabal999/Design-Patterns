package com.prabalhub.design.patterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Demo {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Anand");
		names.add("Anshu");
		names.add("Prabal");
		
		Iterator<String> namesIterater = names.iterator();
		while(namesIterater.hasNext()) {
			System.out.println(namesIterater.next());
			namesIterater.remove();
		}
		for (String name : names) {
			System.out.println(name);
			//names.add("test"); // Iterators are fall fast // Enumeration are fail safe
		}
		
		
		PersonRepo repo = new PersonRepo();
		repo.add("Anand");
		repo.add("Anshu");
		repo.add("Prabal");
		
		for (String name : repo) {
			System.out.println(name);
		}
	}

}
