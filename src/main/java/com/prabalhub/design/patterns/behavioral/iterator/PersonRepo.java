package com.prabalhub.design.patterns.behavioral.iterator;

import java.util.Arrays;
import java.util.Iterator;

public class PersonRepo implements Iterable<String>{

	private String[] persons;
	private int index;
	
	public PersonRepo() {
		persons = new String[10];
		index = 0;
	}
	
	public void add(String person) {
		if(persons.length == index) {
			persons = Arrays.copyOf(persons, persons.length+5);
		}
		persons[index++] = person;
	}
	
	@Override
	public Iterator<String> iterator() {
		return new Iterator<String>() {
			private int currentIndex;
			@Override
			public boolean hasNext() {
				return (currentIndex <= index) && persons[currentIndex] != null;
			}

			@Override
			public String next() {
				return persons[currentIndex++];
			}
		};
	}
}
