package com.project.ecommerce.service;

import com.project.ecommerce.dao.ProductRepository;
import com.project.ecommerce.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Iterable<Product> getAllProducts() {

        return productRepository.findAll();
    }



    public void addProduct(Product product) {
        productRepository.save(product);
    }
}
