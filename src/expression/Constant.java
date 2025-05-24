package expression;

import java.util.HashMap;
import java.util.List;

public class Constant implements Expression{
    private double value;

    public void setValue(double value){
        this.value = value;
    }

    @Override
    public void parse(String leftExpression, String rightExpression) {
        value = Double.parseDouble(leftExpression);

    }

    @Override
    public double calculate() {
        return value;
    }
}
