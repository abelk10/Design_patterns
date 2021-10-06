package visitor;

import bet.*;
import java.util.Stack;

public class CalculatingVisitor implements Visitor{
    Stack<Integer> resStack = new Stack<>();
    int result;

    @Override
    public void visit_number(Element e) {
        resStack.push(e.getValue());
    }

    @Override
    public void visit_operator(Operator e) {
        // Operands for the operator are the top two results
        // on the result stack
        int result1, result2;
        result2 = resStack.pop();
        result1 = resStack.pop();
        resStack.push(e.operate(result1, result2));
    }

    @Override
    public void printResult() {
        System.out.println("[CalculatingVisitor]Result of computing the expression is: " + resStack.peek());
    }

    @Override
    public void reset() {
        result = 0;
        resStack.removeAllElements();
    }
}
