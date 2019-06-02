package com.github.yerasis.talkitstore.repository.impl;

import com.github.yerasis.talkitstore.model.Book;
import com.github.yerasis.talkitstore.repository.BooksRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
@RequiredArgsConstructor
public class BookRepositoryImpl implements BooksRepository {
  private final JdbcTemplate jdbc;


  @Override
  public int addBook(Book book) {
    return jdbc.update("insert into books (name, author, snippet, path, cost,genre) values (?,?,?,?,?,?)",
      book.getName(), book.getAuthor(), book.getSnippet(), book.getPath(), book.getCost(), book.getGenre());
  }

  @Override
  public Book getBook(int id) {
    return jdbc.queryForObject("select * from books where id=?", this::mapRowToBook, id);
  }

  @Override
  public Iterable<Book> getBooksByGenre(String genre) {
    return (genre != null ?
      jdbc.query("select * from books where genre=?", this::mapRowToBook, genre) :
      jdbc.query("select * from books limit 100", this::mapRowToBook)
    );

  }

  @Override
  public int deleteBook(int id) {
    return jdbc.update("update books set actual=false where id=?", id);
  }

  @Override
  public int updateBook(Book book) {
    return jdbc.update("update books set name=?, author=?, snippet=?, path=?, cost=?, genre=? where id=?",
      book.getName(), book.getAuthor(), book.getSnippet(), book.getPath(), book.getCost(), book.getGenre(), book.getId());
  }


  private Book mapRowToBook(ResultSet rs, int id) throws SQLException {
    return new Book(
      rs.getInt("id"),
      rs.getString("name"),
      rs.getString("author"),
      rs.getString("snippet"),
      rs.getString("path"),
      rs.getInt("cost"),
      rs.getString("genre"));
  }
}
