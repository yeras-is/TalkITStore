package com.github.yerasis.talkitstore.service;

import com.github.yerasis.talkitstore.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookSort {

    public List<Book> sortByCostLowest(List<Book> books) {
        if (books.isEmpty()) {
            throw new NullPointerException( "Can't sort empty List" );
        }
        int in;
        for (int out = 0; out < books.size() - 1; out++) {
            Book temp = books.get( out );
            in = out;
            while (in > 0 && books.get( in - 1 ).getCost() > temp.getCost()) {
                books.set( in, books.get( in - 1 ) );
                in--;
            }
            books.set( in, temp );
        }
        return books;
    }

    public List<Book> sortByCostAscending(List<Book> books) {//сортирует цену по возростанию
        if (books.isEmpty()) {
            throw new NullPointerException( "Can't sort empty List" );
        }
        Collections.sort( books, new Comparator<Book>() {
            public int compare(Book one, Book other) {
                return one.getCost().compareTo( other.getCost() );
            }
        }
    }

}
