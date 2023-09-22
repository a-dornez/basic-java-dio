public class InvalidParametersException extends IllegalArgumentException {

    public InvalidParametersException() {}

    public InvalidParametersException(String exceptionMessage) {
        super(exceptionMessage);
    }
}