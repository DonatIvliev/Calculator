package expression;

import java.util.HashMap;
import java.util.List;

public interface Expression {
    void parse(String leftExpression, String rightExpression);
    double calculate();
}
