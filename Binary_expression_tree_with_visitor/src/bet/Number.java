package bet;

import visitor.Visitor;

public class Number extends Element{
    @Override
    public void accept(Visitor v) {
        v.visit_number(this);
    }


    @Override
    public int getValue() {
        return Integer.valueOf(element);
    }

    public Number(String value) {
        super();
        element = value;
    }
}
