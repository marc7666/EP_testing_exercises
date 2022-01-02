package Exercise5.Exceptions;

public class DoesNotExistException extends Exception{
    public DoesNotExistException(String message){
        super(message);
    }
}
