package expression;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Brackets implements Expression{
    private Expression innerExpression;

    @Override
    public void parse(String leftExpression, String rightExpression) {
        String expression = leftExpression;

        if (expression.startsWith("(") && expression.endsWith(")")) {
            expression = expression.substring(1, expression.length() - 1);
        }

        if ((expression.length() == 1) && Character.isAlphabetic(expression.charAt(0))) {
            innerExpression = new Variable();
            innerExpression.parse(expression, "");
        }

        if (MathHelper.isNumber(expression)) {
            innerExpression = new Constant();
            innerExpression.parse(expression, "");
        }

        List<String> parts = findAddition(expression);
        if (!parts.isEmpty()) {
            innerExpression = new Sum();
            innerExpression.parse(parts.get(0), parts.get(1));
        }

        parts = findSubtraction(expression);
        if (!parts.isEmpty()) {
            innerExpression = new Subtraction();
            innerExpression.parse(parts.get(0), parts.get(1));
        }

        parts = findMultiplication(expression);
        if (!parts.isEmpty()) {
            innerExpression = new Multiplication();
            innerExpression.parse(parts.get(0), parts.get(1));
        }

        parts = findDivision(expression);
        if (!parts.isEmpty()) {
            innerExpression = new Division();
            innerExpression.parse(parts.get(0), parts.get(1));
        }



        //innerExpression = parseExpression(expression);
        //innerExpression.parse(expression, "");
    }


    private List<String> findAddition(String expression) {
        List<String> parts = new ArrayList<>();
        int bracketCount = 0;
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '(') bracketCount++;
            else if (c == ')') bracketCount--;
            else if (c == '+' && bracketCount == 0) {
                parts.add(expression.substring(0, i));
                parts.add(expression.substring(i + 1));
                break;
            }
        }
        return parts;
    }

    private List<String> findSubtraction(String expression) {
        List<String> parts = new ArrayList<>();
        int bracketCount = 0;
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '(') bracketCount++;
            else if (c == ')') bracketCount--;
            else if (c == '-' && bracketCount == 0) {
                parts.add(expression.substring(0, i));
                parts.add(expression.substring(i + 1));
                break;
            }
        }
        return parts;
    }

    private List<String> findMultiplication(String expression) {
        List<String> parts = new ArrayList<>();
        int bracketCount = 0;
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '(') bracketCount++;
            else if (c == ')') bracketCount--;
            else if (c == '*' && bracketCount == 0) {
                parts.add(expression.substring(0, i));
                parts.add(expression.substring(i + 1));
                break;
            }
        }
        return parts;
    }

    private List<String> findDivision(String expression) {
        List<String> parts = new ArrayList<>();
        int bracketCount = 0;
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '(') bracketCount++;
            else if (c == ')') bracketCount--;
            else if (c == '/' && bracketCount == 0) {
                parts.add(expression.substring(0, i));
                parts.add(expression.substring(i + 1));
                break;
            }
        }
        return parts;
    }

    @Override
    public double calculate() {
        return innerExpression.calculate();
    }

    private Expression parseExpression(String expr) {

        List<String> elements = tokenize(expr);

        // Handle operations by priority: +-, then */, then function calls
        return buildExpression(elements);
    }

    private List<String> tokenize(String expr) {
            List<String> elements = new ArrayList<>();
        StringBuilder element = new StringBuilder();
        int brackets = 0;

        for (char c : expr.toCharArray()) {
            if (c == '(') brackets++;
            if (c == ')') brackets--;

            if ((c == '+' || c == '-' || c == '*' || c == '/') && brackets == 0) {
                if (element.length() > 0) {
                    elements.add(element.toString());
                    element.setLength(0);
                }
                elements.add(Character.toString(c));
            } else {
                element.append(c);
            }
        }

        if (element.length() > 0) {
            elements.add(element.toString());
        }

        return elements;
    }

    private Expression buildExpression(List<String> elements) {
        return null;
    }

    private int findOperator(List<String> elements, String... operators) {
        return 0;
    }
}
