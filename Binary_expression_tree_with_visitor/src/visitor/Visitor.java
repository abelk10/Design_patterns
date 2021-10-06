package visitor;

import bet.*;

public interface Visitor {
    public void visit_number(Element e);
    public void visit_operator(Operator e);
    public void printResult();
    public void reset();
}
