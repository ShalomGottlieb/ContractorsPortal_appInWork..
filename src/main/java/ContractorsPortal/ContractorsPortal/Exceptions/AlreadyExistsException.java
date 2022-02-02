package ContractorsPortal.ContractorsPortal.Exceptions;

public class AlreadyExistsException extends Exception{
    public AlreadyExistsException() {
        super("Already exists");
    }

    public AlreadyExistsException(String message) {
        super(message);
    }
}
