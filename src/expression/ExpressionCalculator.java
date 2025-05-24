package expression;



public class ExpressionCalculator {
    private String expressionString;

    public void setExpressionString(String expressionString) {
        this.expressionString = expressionString;
        System.out.println("Calculator get expression string: " + expressionString);
        parseExpressionString();
    }

    void parseExpressionString(){
        Expression expression = new Brackets();
        expression.parse(expressionString,"");
        System.out.println(Variable.variables);
    }
}
