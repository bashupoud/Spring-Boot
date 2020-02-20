package com.firstProject.book.repository;

import com.firstProject.book.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {

    List<Book> findByBookId(Integer bookId);




}
