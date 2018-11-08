/**
 * 
 */
package com.prabalhub.design.patterns.structural.bridge;

/**
 * @author prabal
 *
 */
public class DocumentFormatter implements Formatter {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.prabalhub.design.patterns.structural.bridge.Formatter#format(com.
	 * prabalhub.design.patterns.structural.bridge.MoveProduct)
	 */
	public String format(MoveProduct move) {
		StringBuilder data = new StringBuilder();
		data.append("ID:" + move.getId() + "\n");
		data.append("Name:" + move.getName() + "\n");
		data.append("Year:" + move.getYear() + "\n");
		return data.toString();
	}

}
