package bookstore.book.domain;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;
import org.hibernate.validator.constraints.Length;

import java.io.Serializable;
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "livro")
public final class Livro implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty(message = "campo TÍTULO é requerido")
    @Length(min = 3,max = 50, message = "Campo TÍTULO deve ter entre 3 e 100 caracteres")
    private String titulo;

    @NotEmpty(message = "campo NOME DO AUTOR é requerido")
    @Length(min = 3,max = 50, message = "Campo NOME DO AUTOR deve ter entre 3 e 100 caracteres")
    private String nome_autor;

    @NotEmpty(message = "campo TEXTO é requerido")
    @Length(min = 10,max = 10000000, message = "Campo TEXTO deve ter entre 3 e 10.000.000 de caracteres")
    private String texto;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;
}
