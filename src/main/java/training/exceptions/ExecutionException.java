package training.exceptions;


/**
 * Exception with user-friendly message describing problem occurred while application run.
 */
public class ExecutionException extends Exception {

    public ExecutionException() {
    }

    public ExecutionException(final String message) {
        super(message);
    }

    public ExecutionException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public ExecutionException(final Throwable cause) {
        super(cause);
    }
}
