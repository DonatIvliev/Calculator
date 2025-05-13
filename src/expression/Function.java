package expression;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Function implements Expression{
    private Expression left;
    private List<Variable> parts = new ArrayList<>();

    @Override
    public HashMap<String, Variable> parse(String leftExpression, String rightExpression) {
        if((leftExpression.length() == 1) && Character.isAlphabetic(leftExpression.charAt(0))){
            left = new Variable();
        }
        else if(MathHelper.isNumber(leftExpression)){ //Function
            left = new Constant();
        }
        else{
            left = new Brackets();
        }
        return left.parse(leftExpression, "");
    }


    @Override
    public double calculate() {
        return 0;
    }
}
