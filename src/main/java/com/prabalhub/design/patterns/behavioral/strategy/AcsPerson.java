package com.prabalhub.design.patterns.behavioral.strategy;

import java.util.Comparator;

public class AcsPerson implements Comparator<Person>{

	@Override
	public int compare(Person p1, Person p2) {
		if (p1.getAge() > p2.getAge()) {
			return 1;
		} else if (p1.getAge() == p2.getAge()) {
			return 0;
		} else {
			return -1;
		}
	}

}
