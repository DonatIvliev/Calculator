package expression;

import java.util.HashMap;
import java.util.List;

public class Multiplication extends Operation implements Expression{
    @Override
    public double calculate() {
        return left.calculate() * right.calculate();
    }
}
