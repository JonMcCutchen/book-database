package com.bookDatabase.dao;

import com.bookDatabase.entity.Book;

import java.util.List;

public interface BookDAO {
    List<Book> findAll();
    Book findById(int theId);
    void saveOrUpdate(Book theBook);
    void deleteById(int theId);
}
