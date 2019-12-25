package com.hendisantika.springbootelasticsearchexample.controller;

import com.hendisantika.springbootelasticsearchexample.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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


    @GetMapping("/{id}")
    public Map<String, Object> getBookById(@PathVariable String id) {
        return bookService.getBookById(id);
    }
}