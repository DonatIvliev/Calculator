package expression;

import java.util.ArrayList;
import java.util.List;

public class Sum implements Expression{

    private String name;
    private Expression left;
    private Expression right;
    private List<Variable> parts = new ArrayList<>();

    public String getName(){
        return name;
    }




    @Override
    public List<Variable> parse(String expression) {
        String[] expressionParts = expression.split("\\+");
        if((expressionParts[0].length() == 1) && Character.isAlphabetic(expressionParts[0].charAt(0))){
            left = new Variable();
            parts.addAll(left.parse(expressionParts[0]));
        }
        else if()
        return parts;
    }

    @Override
    public double calculate() {
        return 0;
    }
}
