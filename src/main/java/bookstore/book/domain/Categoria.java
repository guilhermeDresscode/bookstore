package bookstore.book.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;
import org.hibernate.validator.constraints.Length;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
@NoArgsConstructor(force = true)
@Data
@EqualsAndHashCode(of = "id")
@Entity
@RequiredArgsConstructor
@Table(name = "categoria")
@Getter
@Setter
public class Categoria implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private final Integer id;

    @NotEmpty(message = "campo NOME é requerido")
    @Length(min = 3,max = 100, message = "Campo NOME deve ter entre 3 e 100 caracteres")
    private final String  nome;

    @NotEmpty(message = "campo DESCRIÇÃO é requerido")
    @Length(min = 3,max = 200, message = "Campo DESCRIÇÃO deve ter entre 3 e 100 caracteres")
    private final String  descricao;


    @OneToMany(mappedBy = "categoria")
    private List<Livro> livro = new ArrayList<>();  
    public void setId(Integer id) {
    }
    public void setNome(String nome){
    }
    public void setDescricao(String descricao){
    }
}
