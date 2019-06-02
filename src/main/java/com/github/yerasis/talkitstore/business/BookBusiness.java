package com.github.yerasis.talkitstore.business;

import com.github.yerasis.talkitstore.model.Book;
import org.springframework.stereotype.Service;

@Service
public interface BookBusiness {

  int addBook(Book book);

  Book getBook(int id);

  Iterable<Book> getBooksByGenre(String genre);

  int deleteBook(int id);

  int updateBook(Book book);


}
