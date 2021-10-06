package bet;

import java.util.ArrayList;
import java.util.Arrays;

public class OperatorFactory {
    // Singleton operator factory
    private static OperatorFactory operatorFactory = null;
    // list of known operators  ordered in their precedence + and * in our case
    private ArrayList<Character> operators = new ArrayList<>(Arrays.asList('*', '+'));
    private OperatorFactory(){}

    public static OperatorFactory getOperatorFactory() {
        if(operatorFactory == null){
            operatorFactory = new OperatorFactory();
        }
        return operatorFactory;
    }

    // returns new operator object
    public Element getOperator(char op) {
        if(op == '+'){
            return new Add();
        }
        if(op == '*'){
            return new Multiply();
        }
        return null;
    }
    //Checks if character is an operator
    public Boolean isOperator(char op){
        return operators.contains(op);
    }
    //Checks if operator1 has higher or equal precedence as operator 2
    public Boolean higherPrecedence(char op1, char op2){
        return operators.indexOf(op1) <= operators.indexOf(op2);
    }
}
