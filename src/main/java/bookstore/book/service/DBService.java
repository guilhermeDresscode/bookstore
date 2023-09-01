package bookstore.book.service;

import bookstore.book.repositories.CategoriaRepository;
import bookstore.book.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService {
    @Autowired
    private CategoriaRepository categoriaRepository;
    @Autowired
    private LivroRepository livroRepository;
    public void instanciaBaseDeDados(){
    }
}
