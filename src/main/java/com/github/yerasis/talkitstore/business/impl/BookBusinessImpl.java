package com.github.yerasis.talkitstore.business.impl;

import com.github.yerasis.talkitstore.business.BookBusiness;
import com.github.yerasis.talkitstore.model.Book;
import com.github.yerasis.talkitstore.repository.BooksRepository;
import com.github.yerasis.talkitstore.service.BookSort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookBusinessImpl implements BookBusiness {
  private final BooksRepository booksRepository;
  private final BookSort bookSort;

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
  public List<Book> getBooksByGenre(String genre, int offset, String sortType) {
    switch (sortType) {
      case ("lowest"):
        return booksRepository.getBooksByGenreAndCostAscending(genre,offset);
      case ("highest"):
        return booksRepository.getBooksByGenreAndCostDescending(genre, offset);
      case ("popularity"):
        return booksRepository.getBooksByGenreAndPopularity(genre, offset);
      default:
        return booksRepository.getBooksByGenre(genre, offset);
    }
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
