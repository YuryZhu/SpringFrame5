package ru.zhi.acp.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.zhi.acp.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
