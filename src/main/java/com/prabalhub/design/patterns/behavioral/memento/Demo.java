package com.prabalhub.design.patterns.behavioral.memento;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Demo {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		EmployeeOriginator prabal = new EmployeeOriginator("9", "Prabal");
		ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("prabal.obj"));
		outputStream.writeObject(prabal);
		outputStream.flush();
		outputStream.close();
		ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("prabal.obj"));
		prabal = (EmployeeOriginator) inputStream.readObject();
		System.out.println("ID:"+ prabal.getId() + " Name:"+ prabal.getName());
	
		EmployeeCareTaker careTaker = new EmployeeCareTaker();
		EmployeeOriginator employee = new EmployeeOriginator("9", "Prabal");
		
		careTaker.save(employee);
		System.out.println(employee);
		
		employee.setName("99");
		careTaker.save(employee);
		System.out.println(employee);
		
		employee.setName("999");
		careTaker.save(employee);
		System.out.println(employee);
		
		careTaker.undo(employee);
		System.out.println(employee);
		
		careTaker.undo(employee);
		System.out.println(employee);
		
		careTaker.undo(employee);
		System.out.println(employee); // original again
		
		//careTaker.undo(employee);
		//System.out.println(employee); // stack over flow
	}
	
}