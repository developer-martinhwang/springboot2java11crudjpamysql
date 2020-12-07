package com.martinhwang.springboot2java11crudjpamysql.controller;

import com.martinhwang.springboot2java11crudjpamysql.model.Book;
import com.martinhwang.springboot2java11crudjpamysql.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping("")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }
    @PostMapping("")
    public void addBook( @RequestBody Book book) {
      bookService.saveBook(book);
    }
}
