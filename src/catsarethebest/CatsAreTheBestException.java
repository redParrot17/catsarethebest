package catsarethebest;

public class CatsAreTheBestException extends RuntimeException {
    public CatsAreTheBestException() {
        super();
    }
    public CatsAreTheBestException(String reason) {
        super(reason);
    }
}
