package ru.zhi.acp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ru.zhi.acp.model.Author;
import ru.zhi.acp.model.Book;
import ru.zhi.acp.repositories.AuthorRepository;
import ru.zhi.acp.repositories.BookRepository;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Lala Katya lalala", "332222123333");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        Author rod = new Author("Roddd", "Jhonsin");
        Book nopEvd = new Book("dsFFF ZXcddd ", "34222222");

        rod.getBooks().add(nopEvd);
        nopEvd.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(nopEvd);

        System.out.println("We are started Boorstrap");
        System.out.println("Number of Books: " + bookRepository.count());
    }
}
