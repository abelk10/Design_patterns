// Abel Kahsay
// Neptun ID: PS70N2

import bet.BET;
import visitor.CalculatingVisitor;
import visitor.PrintingVisitor;
import visitor.Visitor;

public class BETTest {
    public static void main(String[] args) {
        BET t = new BET();
        Visitor printer = new PrintingVisitor();
        Visitor calculator = new CalculatingVisitor();

        t.constructTree("3+5*6");
        t.iterate((PrintingVisitor)printer);
        printer.printResult();
        t.iterate((CalculatingVisitor)calculator);
        calculator.printResult();

        // clear earlier values
        printer.reset();
        calculator.reset();

        t.constructTree("5+6*8+4*5+3");
        t.iterate((PrintingVisitor)printer);
        printer.printResult();
        t.iterate((CalculatingVisitor)calculator);
        calculator.printResult();
    }
}
