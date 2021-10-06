// Abel Kahsay
// Neptun ID: PS70N2

package visitor;

import bet.*;

public class PrintingVisitor implements Visitor{
    StringBuilder p = new StringBuilder();

    private void append(Element e){
        p.append(e.getElement());
    }


    @Override
    public void visit_number(Element e) { this.append(e); }

    @Override
    public void visit_operator(Operator e) {
        this.append(e);
    }

    @Override
    public void printResult() {
        System.out.println("[PrintingVisitor]The expression is: " + p);
    }

    @Override
    public void reset() {
        p = new StringBuilder();
    }
}
