package com.hendisantika.springbootelasticsearchexample.controller;

import com.hendisantika.springbootelasticsearchexample.domain.Book;
import com.hendisantika.springbootelasticsearchexample.service.BookDao;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
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
@RequiredArgsConstructor
public class BookController {
    private final BookDao bookDao;

    @PostMapping
    public Book insertBook(@RequestBody Book book) throws Exception {
        return bookDao.insertBook(book);
    }

    @GetMapping("/{id}")
    public Map<String, Object> getBookById(@PathVariable String id) {
        return bookDao.getBookById(id);
    }

    @PutMapping("/{id}")
    public Map<String, Object> updateBookById(@RequestBody Book book, @PathVariable String id) throws IOException {
        return bookDao.updateBookById(id, book);
    }

    @DeleteMapping("/{id}")
    public void deleteBookById(@PathVariable String id) {
        bookDao.deleteBookById(id);
    }
}
