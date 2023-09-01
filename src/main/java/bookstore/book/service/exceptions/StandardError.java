package bookstore.book.service.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class StandardError {
    private long timestanp;
    private Integer status;
    private String error;

}
