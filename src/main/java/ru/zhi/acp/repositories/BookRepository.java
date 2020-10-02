package ru.zhi.acp.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.zhi.acp.model.Book;

public interface BookRepository  extends CrudRepository<Book, Long> {
}
