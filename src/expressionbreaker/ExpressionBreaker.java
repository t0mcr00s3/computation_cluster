package expressionbreaker;

import expressionbreaker.exceptions.ParenNotFoundException;

import java.util.ArrayList;
import java.util.List;

public final class ExpressionBreaker {
    private final List<String> brokenExpression;
    private final List<Integer> parens;
    private final List<Integer> signsIndex;
    private final SpaceRemoval expression;

    public ExpressionBreaker(String expression){
        this.expression = new SpaceRemoval(expression);
        brokenExpression = new ArrayList<>();
        signsIndex = new ArrayList<>();
        parens = new ArrayList<>();
    }

    public void  breakExpression(){
        getSignIndex();
        System.out.println(signsIndex);
        System.out.println(parens);
    }

    private void getSignIndex() {
        String[] splittedExpression = expression.removeSpace().split("");
        for(int i = 0; i < splittedExpression.length; i++) {
            if(splittedExpression[i].matches("[-*/+]")){
                signsIndex.add(i);
            }else if(splittedExpression[i].matches("[()]")){
                parens.add(i);
            }
        }
        checkParens(splittedExpression);
    }

    private void checkParens(String [] splittedExpression) throws ParenNotFoundException {
        if (parens.size() == 0){
            return ;
        }

        int lparen = 0;
        int rparen = 0;

        for(Integer index : parens){
            if(splittedExpression[index].equals("(")) {
                ++lparen;
            }else if(splittedExpression[index].equals(")")) {
                ++rparen;
            }
        }
        if (lparen - rparen == 0){
            return;
        }
        throw new ParenNotFoundException();
    }

}
