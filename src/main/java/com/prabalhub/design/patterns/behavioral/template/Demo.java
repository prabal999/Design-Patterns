package com.prabalhub.design.patterns.behavioral.template;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Anshu", 99));
        persons.add(new Person("Prabal", 9));
        persons.add(new Person("Anand", 999));
        System.out.println("Before sort:"+persons);
        Collections.sort(persons); // Sort is temple 
        System.out.println("After sort:"+persons);
        
        OrderTemplate order = new ToyOrder(true);
        order.processOrder();
    }

}
