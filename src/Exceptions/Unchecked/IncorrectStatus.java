package Exceptions.Unchecked;

public class IncorrectStatus extends RuntimeException {
    public IncorrectStatus(String message) {
        super(message);
    }
}
