package Exercise8.Exceptions;

/**
 * @project: EP_testing_exercises.
 * @author: mcr99 on 21/01/2022.
 */

public class DoesNotExistException extends Exception {
    public DoesNotExistException(String message) {
        super(message);
    }
}
