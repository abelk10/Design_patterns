package bet;

import visitor.Visitor;

public abstract class Element {
    protected String element;
    protected Element left, right;
    public abstract void accept(Visitor v);
    public Element() {
        left = null;
        right = null;
    }

    public void setLeft(Element left) {
        this.left = left;
    }

    public String getElement() {
        return element;
    }

    public void setRight(Element right) {
        this.right = right;
    }

    public Element getLeft() {
        return left;
    }

    public Element getRight() {
        return right;
    }

    public abstract int getValue();
}
