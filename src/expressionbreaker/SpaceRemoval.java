package expressionbreaker;

public class SpaceRemoval {
    private final String expression;
    public SpaceRemoval(String expression) {
        this.expression = expression;
    }

    public final String removeSpace(){
        StringBuilder newString = new StringBuilder();
        for(String splitted : expression.split("")) {
            if(splitted.equals("")){
                continue;
            }
            newString.append(splitted);
        }
        return newString.toString();
    }
}
