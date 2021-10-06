package bet;

import visitor.*;

import java.util.Stack;

public class BET extends Element{
    @Override
    public int getValue() {
        return this.getLeft().getValue();
    }

    @Override
    public void accept(Visitor v) {
    }

    public void iterate(PrintingVisitor v){
        this.infix(this, v);
    }

    public void iterate(CalculatingVisitor v){
        this.postfix(this, v);
    }

    public void infix(Element elt, Visitor v){
        if (elt != null){
            infix(elt.left, v);
            elt.accept(v);
            infix(elt.right, v);
        }
    }
    public void postfix(Element elt, Visitor v){
        if (elt != null){
            postfix(elt.left, v);
            postfix(elt.right, v);
            elt.accept(v);
        }
    }
    // Constructs Binary Expression Tree(BET) from string
    // assumes operands are single value digits
    // since we are dealing with simple cases I have assumed operands are single digit
    // but can easily be extended for multiple digit values by introducing a while loop
    public void constructTree(String expression){
        Stack<Element> eltStack = new Stack<>(); //Stack for operands
        Stack<Character> opStack = new Stack<>(); //Stack for operators
        OperatorFactory of = OperatorFactory.getOperatorFactory();
        Element op = null;
        char[] expressArr = expression.toCharArray();
        for(char i: expressArr){
            if(of.isOperator(i)){
                // If higher or equal precedence operator in stack pop it
                // before pushing new operator
                if(!opStack.empty() && of.higherPrecedence(opStack.peek(), i)){
                    // the top two elements in element stack are
                    // the right and left children of the popped operator
                    op = of.getOperator(opStack.pop());
                    op.setRight(eltStack.pop());
                    op.setLeft(eltStack.pop());
                    // push operator element to element stack
                    eltStack.push(op);
                }
                opStack.push(i);
            }
            // if element is operand push it to element stack
            else{
                eltStack.push(new Number(String.valueOf(i)));
            }
        }
        // pop all remaining operators
        while (!opStack.empty()){
            // the top two elements in element stack are
            // the right and left children of the popped operator
            op = of.getOperator(opStack.pop());
            op.setRight(eltStack.pop());
            op.setLeft(eltStack.pop());
            eltStack.push(op);
        }
        // Making the tree root point to the whole tree as its left child
        // and null as the right child (the parent constructor sets this on initialization)
        // [can be considered as a 'hack' since we are using the composite pattern]
        element = String.valueOf("");
        this.setLeft(op);
    }
}
