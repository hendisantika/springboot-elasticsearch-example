package com.hendisantika.springbootelasticsearchexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
@EnableElasticsearchRepositories(basePackages = "*")
public class SpringbootElasticsearchExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootElasticsearchExampleApplication.class, args);
	}

}
