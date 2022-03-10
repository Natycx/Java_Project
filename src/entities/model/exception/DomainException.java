package entities.model.exception;

public class DomainException extends RuntimeException{

    private static final long serialVersionUNID = 1L;

    public DomainException(String msg){
        super(msg);
    }
}
