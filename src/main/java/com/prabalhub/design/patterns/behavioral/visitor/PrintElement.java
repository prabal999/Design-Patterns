package com.prabalhub.design.patterns.behavioral.visitor;


public interface PrintElement {
    void accept(PrintVisitor visitor);
}
