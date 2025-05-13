package expression;

import java.util.HashMap;
import java.util.List;

public interface Expression {
    HashMap<String, Variable> parse(String leftExpression, String rightExpression);
    double calculate();
}
