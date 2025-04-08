package expression;

import java.util.List;

public interface Expression {
    List<Variable> parse(String expression);
    double calculate();
}
