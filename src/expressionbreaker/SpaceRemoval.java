package expressionbreaker;

public class SpaceRemoval {
    private final String expression;
    public SpaceRemoval(String expression) {
        this.expression = expression;
    }

    public final String removeSpace(){
        return expression.replaceAll(" ", "");
    }
}
