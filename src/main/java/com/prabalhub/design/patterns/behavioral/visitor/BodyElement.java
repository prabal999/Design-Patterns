package com.prabalhub.design.patterns.behavioral.visitor;


public class BodyElement implements PrintElement {

    @Override
    public void accept(PrintVisitor visitor) {
        visitor.visit(this);
    }

}
