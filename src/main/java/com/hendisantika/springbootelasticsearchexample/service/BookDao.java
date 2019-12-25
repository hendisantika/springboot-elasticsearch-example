package com.hendisantika.springbootelasticsearchexample.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.elasticsearch.client.RestHighLevelClient;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-elasticsearch-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 26/12/19
 * Time: 03.06
 */
public class BookDao {
    private final String INDEX = "bookdata";
    private final String TYPE = "books";
    private RestHighLevelClient restHighLevelClient;
    private ObjectMapper objectMapper;

    public BookDao(ObjectMapper objectMapper, RestHighLevelClient restHighLevelClient) {
        this.objectMapper = objectMapper;
        this.restHighLevelClient = restHighLevelClient;
    }
}
