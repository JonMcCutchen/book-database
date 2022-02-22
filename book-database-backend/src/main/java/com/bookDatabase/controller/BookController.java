package com.bookDatabase.controller;



import com.bookDatabase.entity.Book;
import com.bookDatabase.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = { "http://localhost:3000" })
@RestController
public class BookController {
    private final BookService bookService;

    @Autowired
    public BookController(@Qualifier("bookServiceIMPL") BookService bookService) {
        this.bookService = bookService;
    }

    //http://localhost:8080/retrieveAllBooks
    @GetMapping("/retrieveAllBooks")
    public List<Book> findAll() {
        return bookService.findAll();
    }

    //http://localhost:8080/retrieveBookById/1
    @GetMapping("/retrieveBookById/{bookId}")
    public Book findById(@PathVariable int bookId) {
        return bookService.findById(bookId);
    }

    //http://localhost:8080/addBook
    @PostMapping("/addBook")
    public Book addBook(@RequestBody Book theBook) {
        theBook.setId(0);

        bookService.saveOrUpdate(theBook);
        return theBook;
    }

    //http://localhost:8080/updateBook
    @PutMapping("/updateBook")
    public Book updateBook(@RequestBody Book updateBook) {
        bookService.saveOrUpdate(updateBook);
        return updateBook;
    }

    //http://localhost:8080/deleteBook/1
    @DeleteMapping("/deleteBook/{bookId}")
    public String deleteBook(@PathVariable int bookId) {
        bookService.deleteById(bookId);
        return "Deleted book id : " + bookId;
    }

}
