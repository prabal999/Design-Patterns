package com.prabalhub.design.patterns.behavioral.visitor;

import java.util.List;

public class Printer implements PrintElement {
    List<PrintElement> elements;
    
    public Printer(List<PrintElement> elements){
        this.elements = elements;
    }
    
    @Override
    public void accept(PrintVisitor visitor) {
        for(PrintElement element : elements){
            element.accept(visitor);
        }
        visitor.visit(this);
    }

}
