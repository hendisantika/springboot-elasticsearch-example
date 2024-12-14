package com.hendisantika.springbootelasticsearchexample.controller;

import com.hendisantika.springbootelasticsearchexample.Repository.ProductRepository;
import com.hendisantika.springbootelasticsearchexample.domain.Product;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-elasticsearch-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 14/12/24
 * Time: 11.26
 * To change this template use File | Settings | File Templates.
 */
@Slf4j
@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class ProductsController {
    private final ProductRepository productRepository;

    @GetMapping("")
    public Iterable<Product> findAll() {
        return productRepository.findAll();
    }

    @PostMapping("")
    public Product save(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @PutMapping("update")
    public Product update(@RequestBody Product product) throws Exception {
        if (product.getId() != 0) {
            return productRepository.save(product);
        }
        throw new Exception("Id is required");
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> delete(@PathVariable("id") int id) {
        productRepository.deleteById(id);
        return ResponseEntity.ok("Deleted");
    }
}
