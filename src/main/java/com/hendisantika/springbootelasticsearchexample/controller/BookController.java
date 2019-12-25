package com.hendisantika.springbootelasticsearchexample.controller;

import com.hendisantika.springbootelasticsearchexample.domain.Book;
import com.hendisantika.springbootelasticsearchexample.service.BookDao;
import com.hendisantika.springbootelasticsearchexample.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-elasticsearch-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 26/12/19
 * Time: 03.04
 */
@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @Autowired
    private BookDao bookDao;


    @PostMapping
    public Book insertBook(@RequestBody Book book) throws Exception {
        return bookDao.insertBook(book);
    }

    @GetMapping("/{id}")
    public Map<String, Object> getBookById(@PathVariable String id) {
        return bookDao.getBookById(id);
    }

    @PutMapping("/{id}")
    public Map<String, Object> updateBookById(@RequestBody Book book, @PathVariable String id) {
        return bookDao.updateBookById(id, book);
    }
}