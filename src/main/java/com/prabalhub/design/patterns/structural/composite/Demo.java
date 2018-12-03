package com.prabalhub.design.patterns.structural.composite;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Prabal Srivastava
 *
 */
public class Demo {

	public static void main(String... strings) {
		Map<String, String> applicationProperties = new HashMap<String, String>();
		applicationProperties.put("DEMO", "COMPOSIT");
		applicationProperties.put("EXAMPLE", "JDK");

		Map<String, String> jvmProperties = new HashMap<String, String>();
		jvmProperties.put("DEBUG", "FALSE");

		Map<String, String> globalProperties = new HashMap<String, String>();
		globalProperties.putAll(jvmProperties);
		globalProperties.putAll(applicationProperties);
		System.out.println(globalProperties);

		Employee manager = new Manager("001", "Asawari", "27k"); // composite
		Employee lead1 = new Lead("002", "Anshu", "18k"); // composite
		Employee lead2 = new Lead("003", "Anand", "18k"); // composite
		Employee dev1 = new Dev("004", "Sid", "9k"); // leaf
		Employee dev2 = new Dev("005", "Gaurav", "9k"); // leaf
		Employee dev3 = new Dev("006", "Prabal", "9k"); // leaf
		Employee dev4 = new Dev("007", "Sagar", "9k"); // leaf

		manager.add(lead1);
		manager.add(lead2);

		lead1.add(dev1);
		lead1.add(dev2);

		lead2.add(dev3);
		lead2.add(dev4);

		manager.getAll(); // need to be implemented in composites.
		lead1.getAll(); // need to be implemented in composites.
		lead2.getAll(); // need to be implemented in composites.

		//dev1.getAll(); // Not supported in leaf.

		System.out.println(manager.getDetails()); // supported by both (composite and leaf).
		System.out.println(lead1.getDetails());
		System.out.println(lead2.getDetails());
		System.out.println(dev1.getDetails());
		System.out.println(dev2.getDetails());
		System.out.println(dev3.getDetails());
		System.out.println(dev4.getDetails());
		
		dev1.getAll(); // Not supported in leaf.
		
	}
}
