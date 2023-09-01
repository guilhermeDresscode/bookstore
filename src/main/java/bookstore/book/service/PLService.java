package bookstore.book.service;

import bookstore.book.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class PLService {

    @Autowired
    private LivroRepository livroRepository;

    public void instanciaDados(){
    }
}
