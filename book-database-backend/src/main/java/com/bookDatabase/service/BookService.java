package com.bookDatabase.service;

import com.bookDatabase.entity.Book;

import java.util.List;

public interface BookService {
    List<Book> findAll();
    Book findById(int bookId);
    void saveOrUpdate(Book theBook);
    void deleteById(int bookId);
}
