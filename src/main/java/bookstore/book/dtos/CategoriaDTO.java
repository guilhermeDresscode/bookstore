package bookstore.book.dtos;

import bookstore.book.domain.Categoria;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import java.io.Serializable;

@Data
@AllArgsConstructor
public class CategoriaDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private final Integer id;

    @NotEmpty(message = "campo NOME é requerido")
    @Length(min = 3,max = 100, message = "Campo NOME deve ter entre 3 e 100 caracteres")
    private final String  nome;

    @NotEmpty(message = "campo DESCRIÇÃO é requerido")
    @Length(min = 3,max = 200, message = "Campo DESCRIÇÃO deve ter entre 3 e 100 caracteres")
    private final String  descricao;

    public CategoriaDTO(Categoria obj){
        super();
        this.id = obj.getId();
        this.nome = obj.getNome();
        this.descricao = obj.getDescricao();
    }
}
