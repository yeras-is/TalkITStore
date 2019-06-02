package com.github.yerasis.talkitstore.repository;

import com.github.yerasis.talkitstore.model.Book;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepository {

  int addBook(Book book);

  Book getBook(int id);

  Iterable<Book> getBooksByGenre(String genre);

  int deleteBook(int id);

  int updateBook(Book book);

}
