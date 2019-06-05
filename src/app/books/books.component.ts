import {Component, OnInit} from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {Book} from '../model/book.model';
import {BooksService} from '../service/books.service';

@Component({
  selector: 'app-market',
  templateUrl: './books.component.html',
  styleUrls: ['./books.component.css']
})
export class BooksComponent implements OnInit {
  books: Book[];

  constructor(private http: HttpClient, private booksService: BooksService) {
  }

  ngOnInit(): void {
    this.booksService.getBooks().subscribe(data => {
      this.books = data;
    });
  }

}

