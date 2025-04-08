package expression;

import java.util.List;

public class Variable implements  Expression{
    private String name;
    private double value;


    public String getName(){
        return name;
    }

    public void setValue(double value){
        this.value = value;
    }


    @Override
    public Variable parse(String expression) {
        name = expression;
        return List.of(new Variable[]{this});
    }

    @Override
    public double calculate() {
        return value;
    }
}
