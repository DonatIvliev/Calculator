package expression;

import java.util.List;

public class Subtraction implements Expression{
    @Override
    public Variable parse(String expression) {
        return List.of();
    }

    @Override
    public double calculate() {
        return 0;
    }
}
