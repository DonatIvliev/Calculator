package expression;

import java.util.ArrayList;
import java.util.List;

public class Sum extends Operation implements  Expression{

    private String name;

    public String getName(){
        return name;
    }

    @Override
    public double calculate() {
        double leftValue = left.calculate();
        double rightValue = right.calculate();
        System.out.println("Sum = " + (leftValue + rightValue));
        return leftValue + rightValue;
    }
}
