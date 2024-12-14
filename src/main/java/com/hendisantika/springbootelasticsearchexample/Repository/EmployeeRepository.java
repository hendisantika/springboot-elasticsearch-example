package com.hendisantika.springbootelasticsearchexample.Repository;

import com.hendisantika.springbootelasticsearchexample.domain.Employee;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

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
public interface EmployeeRepository extends ElasticsearchRepository<Employee, String> {
}
