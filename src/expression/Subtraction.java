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
        return left.calculate() - right.calculate();
    }
}
