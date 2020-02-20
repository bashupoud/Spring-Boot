package com.firstProject.book.service;

import com.firstProject.book.model.*;
import com.firstProject.book.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

             /*List<Book> books = new ArrayList<>(Arrays.asList(
             new Book(111, "For Whom the Bell Tolls", "Ernest Hemingway", "Story", "Excellent!"),
             new Book(112, "Man and Superman","G. B. Shaw","Fiction","Great"),
             new Book(113, "The Vegetarian","Han Kang", "Original", "Good")));
             */


    public List<Book> getBookList() {
        List<Book> books = new ArrayList<>();
        bookRepository.findAll().forEach(books::add);
        return books;
    }

    public List<Book>  getBook(int id) {
        return bookRepository.findByBookId(id);


       // Optional<Book> books = bookRepository.findById(id);
        //System.out.println(books.get().getBookAuthor()+ " " + books.get().getBookName());
        //return books;

    }

    public void addBook(Book book) {
        bookRepository.save(book);
    }

    public void updateBook(int id, Book book) {
        bookRepository.save(book);

    }

    public void deleteBook(int id) {
        bookRepository.deleteById(id);
    }
}
