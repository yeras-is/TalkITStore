import {Injectable} from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {Book} from '../model/book.model';


const httpOptions = {
  headers: new HttpHeaders({'Content-Type': 'application/json'})
};

@Injectable()
export class BooksService {

  constructor(private http: HttpClient) {
  }

  private bookUrl = 'http://localhost:8080/books';

  public getBooks() {
    return this.http.get<Book[]>(this.bookUrl);
  }

  public deleteBook(book) {
    return this.http.delete(this.bookUrl + '/' + book.id);
  }

  public createBook(book) {
    return this.http.post<Book>(this.bookUrl, book);
  }

  public sortBookByCost(books) {

  }
}
