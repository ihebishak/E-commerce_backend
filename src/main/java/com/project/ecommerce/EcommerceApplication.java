package com.project.ecommerce;

import com.project.ecommerce.dao.CategoryRepository;
import com.project.ecommerce.dao.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcommerceApplication {
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private CategoryRepository categoryRepository;


	public static void main(String[] args) {
		SpringApplication.run(EcommerceApplication.class, args);
	}


}
