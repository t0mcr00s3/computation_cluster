package expressionbreaker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class ExpressionBreaker {
    private final List<String> brokenExpression;

    private final List<Integer> signsIndex;
    private final SpaceRemoval expression;

    public ExpressionBreaker(String expression){
        this.expression = new SpaceRemoval(expression);
        brokenExpression = new ArrayList<>();
        signsIndex = new ArrayList<>();
    }

    public void  breakExpression(){
        getSignIndex();
        System.out.println(signsIndex);
    }

    private void getSignIndex() {
        String[] splittedExpression = expression.removeSpace().split("");
        for(int i = 0; i < splittedExpression.length; i++) {
            if("\\+|\\-|\\*|\\/".matches(splittedExpression[i])){
                signsIndex.add(i);
            }
        }
    }

}
