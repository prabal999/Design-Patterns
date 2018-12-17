package com.prabalhub.design.patterns.behavioral.visitor;


public interface PrintVisitor {

    void visit(Printer printer);

    void visit(HeaderElement headerElement);

    void visit(BodyElement bodyElement);

    void visit(FooterElement footerElement);
    
}
