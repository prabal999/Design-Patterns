package com.prabalhub.design.patterns.behavioral.visitor;


public class HeaderElement implements PrintElement {

    @Override
    public void accept(PrintVisitor visitor) {
        visitor.visit(this);
    }

}
