package com.prabalhub.design.patterns.structural.bridge;

public class HTMLFormatter implements Formatter {

	public String format(MoveProduct move) {
		StringBuilder data = new StringBuilder("<table>\n");
		data.append("\t<tr><td>ID:</td><td>" + move.getId() + "</td></tr>\n");
		data.append("\t<tr><td>NAME:</td><td>" + move.getName() + "</td></tr>\n");
		data.append("\t<tr><td>YEAR:</td><td>" + move.getYear() + "</td></tr>\n");
		data.append("</table>");
		return data.toString();
	}

}
