package com.hendisantika.springbootelasticsearchexample.Repository;

import com.hendisantika.springbootelasticsearchexample.domain.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-elasticsearch-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 14/12/24
 * Time: 11.25
 * To change this template use File | Settings | File Templates.
 */
public interface ProductRepository extends ElasticsearchRepository<Product, Integer> {
}
