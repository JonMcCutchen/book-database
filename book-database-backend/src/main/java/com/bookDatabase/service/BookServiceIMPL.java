package com.bookDatabase.service;

import com.bookDatabase.dao.BookDAO;
import com.bookDatabase.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceIMPL implements BookService {
    private final BookDAO bookDAO;

    @Autowired
    public BookServiceIMPL(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }


    @Override
    public List<Book> findAll() {
        return bookDAO.findAll();
    }

    @Override
    public Book findById(int bookId) {
        return bookDAO.findById(bookId);
    }

    @Override
    public void saveOrUpdate(Book theBook) {
        bookDAO.saveOrUpdate(theBook);
    }

    @Override
    public void deleteById(int bookId) { bookDAO.deleteById(bookId);
    }
}
