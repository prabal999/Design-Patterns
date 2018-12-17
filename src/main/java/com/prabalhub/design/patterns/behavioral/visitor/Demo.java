package com.prabalhub.design.patterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
	    List<PrintElement> elements = new ArrayList<>();
	    elements.add(new HeaderElement());
	    elements.add(new BodyElement());
	    elements.add(new FooterElement());
	    Printer printer = new Printer(elements);
	    printer.accept(new HTMLPrinter());

	}

}
