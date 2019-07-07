package com.github.yerasis.talkitstore.business;

import com.github.yerasis.talkitstore.model.library.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookBusiness {

  int addBook(Book book);

  Book getBook(int id);

  List<Book> getBooksByGenre(String genre, int offset, String sortType);

  int deleteBook(int id);

  int updateBook(Book book);

}
