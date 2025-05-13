package expression;

public class MathHelper {
    public static boolean isNumber(String expression){
        try{
            Double.parseDouble(expression);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }
}
