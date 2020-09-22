package co.com.konecta.techincaltest.exception;

public class ApiRequestException extends Exception {

    private int statusCode;

    public ApiRequestException(String message) {
        super(message);

    }

    public ApiRequestException(String message, Throwable cause) {
        super(message, cause);
    }
}
