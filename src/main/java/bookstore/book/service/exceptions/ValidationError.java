package bookstore.book.service.exceptions;
import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
public class ValidationError extends StandardError{
    private List<FieldMessage> errors = new ArrayList<>();
    public ValidationError(long timestanp, Integer status, String error) {
        super(timestanp, status, error);
    }

    public ValidationError() {
        super();
    }
    public void addErrors(String fieldName, String message){
        this.errors.add(new FieldMessage(fieldName, message));
    }
}
