package expression;

public class ExpressionCalculator {
    private String expressionString;

    public void setExpressionString(String expressionString) {
        this.expressionString = expressionString;
        parseExpressionString();
        System.out.println("Calculator get expression string: " + expressionString);
    }

    void parseExpressionString(){

    }
}
