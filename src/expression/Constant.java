package expression;

import java.util.List;

public class Constant implements Expression{
    private double value;

    public void setValue(double value){
        this.value = value;
    }

    @Override
    public Variable parse(String expression) {
        return List.of(new Constant[]{});
    }

    @Override
    public double calculate() {
        return value;
    }
}
