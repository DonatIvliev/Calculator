package expression;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Operation {
    private Expression left;
    private Expression right;

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
        left.parse(leftExpression,"");


        if((rightExpression.length() == 1) && Character.isAlphabetic(rightExpression.charAt(0))){
            if(Variable.variables.get(rightExpression) == null) {
                right = new Variable();
            }
            else{
                right = Variable.variables.get(rightExpression);
            }

        }
        else if(MathHelper.isNumber(rightExpression)){ //Function
            right = new Constant();
        }
        else{
            right = new Brackets();
        }
        right.parse(rightExpression,"" );

    }


}
