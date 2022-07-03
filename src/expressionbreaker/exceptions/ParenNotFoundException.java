package expressionbreaker.exceptions;

public class ParenNotFoundException extends RuntimeException{
    public ParenNotFoundException() {
        super("Paren not found");
    }
}
