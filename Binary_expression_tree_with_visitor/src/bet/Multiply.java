package bet;

import visitor.Visitor;

public class Multiply extends Operator{
    @Override
    public int getValue() {
        return this.operate();
    }

    @Override
    public void accept(Visitor v) {
        v.visit_operator(this);
    }

    @Override
    public int operate() {
        return left.getValue() + right.getValue();
    }

    @Override
    public int operate(int a, int b) {
        return a * b;
    }

    public Multiply() {
        element = "*";
    }
}
