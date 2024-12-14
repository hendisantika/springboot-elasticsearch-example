package com.hendisantika.springbootelasticsearchexample.domain;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-elasticsearch-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 14/12/24
 * Time: 11.33
 * To change this template use File | Settings | File Templates.
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "employee")
public class Employee {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String department;
}
