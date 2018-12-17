package com.prabalhub.design.patterns.behavioral.strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Anshu", 999));
		persons.add(new Person("Prabal", 9));
		persons.add(new Person("Anand", 99));

		Collections.sort(persons, new AcsPerson());
		System.out.println(persons);
		
		Collections.sort(persons, new DescPerson());
		System.out.println(persons);
		
		// Comparator : Strategy
		// AcsPerson and DescPerson : are strategy implementations
		// Demo: context
	}
}
