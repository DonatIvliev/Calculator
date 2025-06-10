package expression;

import java.util.HashMap;
import java.util.List;

public class Division extends Operation implements Expression{

    @Override
    public double calculate() {

        double leftValue = left.calculate();
        double rightValue = right.calculate();
        System.out.println("Division = " + (leftValue / rightValue));
        return leftValue / rightValue;
    }
}
