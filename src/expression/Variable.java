package expression;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Variable implements Expression {
    private String name;
    private double value;

    public static final HashMap<String, Variable> variables = new HashMap<>();


    public String getName() {
        return name;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public void parse(String leftExpression, String rightExpression) {
        name = leftExpression;
        variables.put(name, this);
        //TODO add new field to UI
    }

    @Override
    public double calculate() {

        System.out.println(name + "=" + value);
        return value;
    }
}
