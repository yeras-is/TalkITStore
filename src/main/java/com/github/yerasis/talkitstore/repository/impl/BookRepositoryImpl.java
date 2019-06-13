package com.github.yerasis.talkitstore.repository.impl;

import com.github.yerasis.talkitstore.model.Book;
import com.github.yerasis.talkitstore.repository.BooksRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

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
  public List<Book> getBooksByGenre(String genre, int offset) {
    return (genre != null ?
      jdbc.query("select * from books where genre=? limit 15 offset ?", this::mapRowToBook, genre,offset) :
      jdbc.query("select * from books", this::mapRowToBook)
    );
  }

  @Override
  public List<Book> getBooksByGenreAndPopularity(String genre, int offset){
    return (genre != null ?
      jdbc.query("select * from books where genre=? order by popularity limit 15 offset ? ", this::mapRowToBook, genre,offset) :
      jdbc.query("select * from books order by popularity", this::mapRowToBook)
    );
  }

  @Override
  public List<Book> getBooksByGenreAndCostAscending(String genre, int offset){
    return (genre != null ?
      jdbc.query("select * from books where genre=? order by cost limit 15 offset ? ", this::mapRowToBook, genre,offset) :
      jdbc.query("select * from books order by cost", this::mapRowToBook)
    );
  }

  @Override
  public List<Book> getBooksByGenreAndCostDescending(String genre, int offset){
    return (genre != null ?
      jdbc.query("select * from books where genre=? order by cost DESC limit 15 offset ? ", this::mapRowToBook, genre,offset) :
      jdbc.query("select * from books order by cost DESC ", this::mapRowToBook)
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
