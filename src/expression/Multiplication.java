package expression;

import java.util.HashMap;
import java.util.List;

public class Multiplication extends Operation implements Expression{
    @Override
    public double calculate() {

        double leftValue = left.calculate();
        double rightValue = right.calculate();
        System.out.println("Multiplication = " + (leftValue * rightValue));
        return leftValue * rightValue;

    }
}
