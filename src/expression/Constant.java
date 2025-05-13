package expression;

import java.util.HashMap;
import java.util.List;

public class Constant implements Expression{
    private double value;

    public void setValue(double value){
        this.value = value;
    }

    @Override
    public HashMap<String, Variable> parse(String leftExpression, String rightExpression) {
        return Variable.variables;
    }

    @Override
    public double calculate() {
        return value;
    }
}
