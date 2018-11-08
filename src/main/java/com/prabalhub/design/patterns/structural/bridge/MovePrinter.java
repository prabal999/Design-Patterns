package com.prabalhub.design.patterns.structural.bridge;


/**
 * @author Prabal Srivastava
 *
 */
public class MovePrinter implements Printer {

	private Formatter formatter;
	
	public MovePrinter(Formatter formater) {
		this.formatter =formater;
	}
	/* (non-Javadoc)
	 * @see com.prabalhub.design.patterns.structural.bridge.Printer#print(com.prabalhub.design.patterns.structural.bridge.MoveProduct)
	 */
	public String print(MoveProduct move) {
		// TODO Auto-generated method stub
		return formatter.format(move);
	}

}
