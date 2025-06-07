package expression;


import java.util.ArrayList;
import java.util.HashMap;

public class ExpressionCalculator {
    private String expressionString;
    private Expression expression;
    public void setExpressionString(String expressionString) {
        this.expressionString = expressionString;
        System.out.println("Calculator get expression string: " + expressionString);
        parseExpressionString();
    }

    void parseExpressionString(){
        expression = new Brackets();
        expression.parse(expressionString,"");
        System.out.println(Variable.variables);
    }

    public ArrayList<String> getVariablesList(){
        return new ArrayList<>(Variable.variables.keySet());
    }

    public void setVariablesValue(HashMap<String, String> variablesValue) {
        for(var key : variablesValue.keySet()){
            Variable.variables.get(key).setValue(Double.parseDouble(variablesValue.get(key)));
        }
    }

    public String calculate() {
        return  String.valueOf(expression.calculate());
    }
}
