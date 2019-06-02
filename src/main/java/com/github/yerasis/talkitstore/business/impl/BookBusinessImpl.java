package com.github.yerasis.talkitstore.business.impl;

import com.github.yerasis.talkitstore.business.BookBusiness;
import com.github.yerasis.talkitstore.model.Book;
import com.github.yerasis.talkitstore.repository.BooksRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookBusinessImpl implements BookBusiness {
  private final BooksRepository booksRepository;


  @Override
  public int addBook(Book book) {
    int result = booksRepository.addBook(book);
    return result;
  }

  @Override
  public Book getBook(int id) {
    return booksRepository.getBook(id);
  }

  @Override
  public Iterable<Book> getBooksByGenre(String genre) {
    Iterable<Book> books = booksRepository.getBooksByGenre(genre);
    //sort service goes here
    return books;
  }

  @Override
  public int deleteBook(int id) {
    int result = booksRepository.deleteBook(id);
    return result;
  }

  @Override
  public int updateBook(Book book) {
    int result = booksRepository.updateBook(book);
    return result;
  }
}
