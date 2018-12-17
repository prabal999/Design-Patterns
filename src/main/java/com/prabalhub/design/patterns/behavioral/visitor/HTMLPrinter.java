package com.prabalhub.design.patterns.behavioral.visitor;


public class HTMLPrinter implements PrintVisitor {

    @Override
    public void visit(Printer printer) {
        System.out.println("<h1>HTML print done.</h1>");
    }

    @Override
    public void visit(HeaderElement headerElement) {
        System.out.println("<header>This is header of an application</header>");
    }

    @Override
    public void visit(BodyElement bodyElement) {
        System.out.println("<body>This is the body of html</body>");
    }

    @Override
    public void visit(FooterElement footerElement) {
        System.out.println("<footer>End of html print.<footer>");
    }

    
}
