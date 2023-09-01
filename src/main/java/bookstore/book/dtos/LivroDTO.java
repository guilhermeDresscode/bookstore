package bookstore.book.dtos;

import bookstore.book.domain.Livro;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
@Getter
@Setter
@AllArgsConstructor
@Data
public class LivroDTO implements Serializable {
    private Integer id;
    private String titulo;

    public LivroDTO() {
        super();
    }

    public LivroDTO(Livro obj) {
        super();
        this.id = obj.getId();
        this.titulo = obj.getTitulo();
    }
}
