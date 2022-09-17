package ExException.models.exceptions;

import java.io.Serial;

public class ValueException extends Exception {
    @Serial
    private static final long serialVersionUID = 1L;
    public ValueException(String msg){
        super(msg);
    }
}
