package expression;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Function implements Expression{
    private Expression left;
    private List<Variable> parts = new ArrayList<>();

    @Override
    public void parse(String leftExpression, String rightExpression) {
        if((leftExpression.length() == 1) && Character.isAlphabetic(leftExpression.charAt(0))){
            if(Variable.variables.get(leftExpression) == null) {
                left = new Variable();
            }
            else{
                left = Variable.variables.get(leftExpression);
            }

        }
        else if(MathHelper.isNumber(leftExpression)){ //Function
            left = new Constant();
        }
        else{
            left = new Brackets();
        }
        left.parse(leftExpression, "");
    }


    @Override
    public double calculate() {
        return 0;
    }
}
