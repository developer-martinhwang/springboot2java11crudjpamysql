package com.martinhwang.springboot2java11crudjpamysql.service;

import com.martinhwang.springboot2java11crudjpamysql.model.Book;
import com.martinhwang.springboot2java11crudjpamysql.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class BookService {
    @Autowired
    private BookRepository bookRepository;
    public List<Book> getAllBooks()
    {
        return bookRepository.findAll();
    }
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }
    public Book getBook(Integer id) {
        return bookRepository.findById(id).get();
    }
    public void deleteBook(Integer id) {
        bookRepository.deleteById(id);
    }
}

