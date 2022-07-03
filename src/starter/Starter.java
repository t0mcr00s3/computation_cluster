package starter;

import expressionbreaker.ExpressionBreaker;

public class Starter {

    private final ExpressionBreaker expressionBreaker;

    public Starter(String expression) {
        expressionBreaker = new ExpressionBreaker(expression);
    }

    public void start() {
        expressionBreaker.breakExpression();
    }
}