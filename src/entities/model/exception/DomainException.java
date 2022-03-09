package entities.model.exception;

public class DomainException extends Exception{

    private static final long serialVersionUNID = 1l;

    public DomainException(String msg){
        super(msg);
    }
}
