package bookstore.book.service;

import bookstore.book.domain.Categoria;
import bookstore.book.domain.Livro;
import bookstore.book.repositories.CategoriaRepository;
import bookstore.book.repositories.LivroRepository;
import bookstore.book.service.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivroService {
    @Autowired
    private LivroRepository repository;

    @Autowired
    private CategoriaService categoriaService;

    public Livro findById(Integer id){
        Optional<Livro> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException
                ("Objeto não encontrado! id:"+ id+ "Tipo: "+ Livro.class.getName()));

    }

    public List<Livro> findAll(Integer id_cat) {
        categoriaService.findById(id_cat);
        return repository.findAllByCategoria(id_cat);
    }

    public Livro update(Integer id, Livro  obj) {
        Livro newObj = findById(id);
        updateData(newObj, obj);
        return repository.save(newObj);
    }

    private void updateData(Livro newObj, Livro obj) {
        newObj.setTitulo(obj.getTitulo());
        newObj.setNome_autor(obj.getNome_autor());
        newObj.setTexto(obj.getTexto());
    }

    public Livro create(Integer id_Cat, Livro obj) {
        obj.setId(null);
        Categoria cat = categoriaService.findById(id_Cat);
        obj.setCategoria(cat);
        return repository.save(obj);
    }

    public void delete(Integer id) {
         Livro obj = findById(id);
         repository.delete(obj);
    }
}
