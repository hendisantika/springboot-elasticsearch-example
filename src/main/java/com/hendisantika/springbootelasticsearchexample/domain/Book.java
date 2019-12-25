package com.hendisantika.springbootelasticsearchexample.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-elasticsearch-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 26/12/19
 * Time: 02.50
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "hendi", type = "books")
public class Book {
    @Id
    private String id;
    private String title;
    private String author;
    private float price;
    private String releaseDate;

}
