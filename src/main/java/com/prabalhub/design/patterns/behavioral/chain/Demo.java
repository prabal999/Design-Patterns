package com.prabalhub.design.patterns.behavioral.chain;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Demo {
	private static final Logger log = Logger.getLogger(Demo.class.getName());
	
	public static void main(String[] args) {
		log.setLevel(Level.FINE);
		ConsoleHandler console = new ConsoleHandler();
		console.setLevel(Level.FINEST);
		log.addHandler(console);
		log.fine("This is fine log");
		log.finest("This is finest log");
		log.finer("This is finer log");
		
		
		
		Director director = new Director();
		VP vp = new VP();
		CEO ceo = new CEO();
		
		director.addSuccessor(vp);
		vp.addSuccessor(ceo);
		
		director.handleRequest(new Request(500));
		director.handleRequest(new Request(5000));
		director.handleRequest(new Request(50000));
		director.handleRequest(new Request(500000)); // No one can handle this. It OK.
	}

}
