package com.github.yerasis.talkitstore.repository;

import com.github.yerasis.talkitstore.model.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BooksRepository {

  int addBook(Book book);

  Book getBook(int id);

  List<Book> getBooksByGenre(String genre,int offset);

  int deleteBook(int id);

  int updateBook(Book book);

}
