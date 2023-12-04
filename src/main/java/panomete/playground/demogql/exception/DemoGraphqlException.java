package panomete.playground.demogql.exception;

public class DemoGraphqlException extends RuntimeException {
    public DemoGraphqlException(String message, Integer statusCode) {
        super("error code : " + statusCode + " | message : " + message);
    }
}
