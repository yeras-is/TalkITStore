package com.github.yerasis.talkitstore.controller;

import com.github.yerasis.talkitstore.business.BookBusiness;
import com.github.yerasis.talkitstore.model.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/books")
@RequiredArgsConstructor
public class BookController {
  private final BookBusiness booksBusiness;


  @GetMapping("{id}")
  public Book getBook(@PathVariable int id) {
    return booksBusiness.getBook(id);
  }

  @PostMapping
  public int addBook(@Valid @ModelAttribute Book book, Errors errors) {
    if (errors.hasErrors()) {
      System.out.println(errors);
      return 0;
    }
    System.out.println(book);
    return booksBusiness.addBook(book);
  }

  @GetMapping
  public Iterable<Book> getBooks(String genre) {
    return booksBusiness.getBooksByGenre(genre);
  }

  @PutMapping
  public int updateBook(@Valid @ModelAttribute(value = "book") Book book, Errors errors) {
    if (errors.hasErrors()) {
      return 0;
    }
    return booksBusiness.updateBook(book);
  }

  @DeleteMapping
  public int deleteBook(Integer id) {
    if (id == null) {
      return 0;
    }
    return booksBusiness.deleteBook(id);
  }

}
