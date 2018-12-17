package com.prabalhub.design.patterns.behavioral.visitor;


public class FooterElement implements PrintElement {

    @Override
    public void accept(PrintVisitor visitor) {
        visitor.visit(this);
    }
}
