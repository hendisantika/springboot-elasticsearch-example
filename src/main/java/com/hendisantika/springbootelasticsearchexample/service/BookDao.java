package com.hendisantika.springbootelasticsearchexample.service;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch._types.ElasticsearchException;
import co.elastic.clients.elasticsearch.core.DeleteResponse;
import co.elastic.clients.elasticsearch.core.GetResponse;
import co.elastic.clients.elasticsearch.core.IndexResponse;
import co.elastic.clients.elasticsearch.core.UpdateResponse;
import com.hendisantika.springbootelasticsearchexample.domain.Book;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-elasticsearch-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 26/12/19
 * Time: 03.06
 */

@Service
public class BookDao {
    private static final String INDEX = "bookdata";
    private final ElasticsearchClient elasticsearchClient;

    public BookDao(ElasticsearchClient elasticsearchClient) {
        this.elasticsearchClient = elasticsearchClient;
    }

    public Book insertBook(Book book) {
        book.setId(UUID.randomUUID().toString());
        try {
            IndexResponse response = elasticsearchClient.index(i -> i
                    .index(INDEX)
                    .id(book.getId())
                    .document(book));
        } catch (ElasticsearchException e) {
            e.getMessage();
        } catch (IOException ex) {
            ex.getLocalizedMessage();
        }
        return book;
    }

    public Map<String, Object> getBookById(String id) {
        try {
            GetResponse<Map> response = elasticsearchClient.get(g -> g.index(INDEX).id(id), Map.class);
            return response.source();
        } catch (IOException e) {
            e.getLocalizedMessage();
        }
        return null;
    }

    public Map<String, Object> updateBookById(String id, Book book) throws IOException {
        Map<String, Object> error = new HashMap<>();
        error.put("Error", "Unable to update book");
        try {
            UpdateResponse<Map> response = elasticsearchClient.update(u -> u
                    .index(INDEX)
                    .id(id)
                    .doc(book)
                    .source(s -> s.fetch(true)), Map.class);
            if (response.get() != null) {
                return response.get().source();
            }
        } catch (ElasticsearchException e) {
            e.getMessage();
        } catch (IOException e) {
            e.getLocalizedMessage();
        }
        return error;
    }

    public void deleteBookById(String id) {
        try {
            DeleteResponse response = elasticsearchClient.delete(d -> d.index(INDEX).id(id));
        } catch (IOException e) {
            e.getLocalizedMessage();
        }
    }
}
