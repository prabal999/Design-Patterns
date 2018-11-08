package com.prabalhub.design.patterns.structural.bridge;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.derby.jdbc.EmbeddedDriver;

public class Demo {

	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new EmbeddedDriver());
			String dbURL = "jdbc:derby:memory:codejava/webdb;create=true";
			Connection connection = DriverManager.getConnection(dbURL);
			
			Statement statement = connection.createStatement();
			statement.executeUpdate("CREATE TABLE USERS (ID INT, NAME VARCHAR(20), CITY VARCHAR(20))");
			System.out.println("Table created");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		MoveProduct starWarsMovive = new MoveProduct("001","Star Wars","1977");
		
		Printer printer = new MovePrinter(new DocumentFormatter());
		System.out.println(printer.print(starWarsMovive));
		printer = new MovePrinter(new HTMLFormatter());
		System.out.println(printer.print(starWarsMovive));
	}
}
