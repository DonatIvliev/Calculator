package expression;

import java.util.HashMap;
import java.util.List;

public class Subtraction extends Operation implements Expression{

    private String name;

    public String getName(){
        return name;
    }

    @Override
    public double calculate() {
        double leftValue = left.calculate();
        double rightValue = right.calculate();
        System.out.println("Subtraction = " + (leftValue - rightValue));
        return leftValue - rightValue;
    }
}
