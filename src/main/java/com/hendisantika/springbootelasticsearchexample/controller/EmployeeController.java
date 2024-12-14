package com.hendisantika.springbootelasticsearchexample.controller;

import com.hendisantika.springbootelasticsearchexample.Repository.EmployeeRepository;
import com.hendisantika.springbootelasticsearchexample.domain.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
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
 * Time: 11.35
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RequestMapping("/api/employees")
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeRepository repository;

    @PostMapping
    public Employee create(@RequestBody Employee employee) {
        return repository.save(employee);
    }
}
