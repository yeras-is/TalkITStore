package com.github.yerasis.talkitstore.controller;

import com.github.yerasis.talkitstore.business.BookBusiness;
import com.github.yerasis.talkitstore.model.library.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
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
      return 0;
    }
    return booksBusiness.addBook(book);
  }

  @GetMapping
  public List<Book> getBooks(String genre, Integer offset,String sortType) {
    offset = offset!=null ? offset : 0;
    sortType = sortType!=null ? sortType : "";
    return booksBusiness.getBooksByGenre(genre,offset, sortType);
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
