package com.project.ecommerce.controller;

import com.project.ecommerce.entity.Product;
import com.project.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class ProductController {
 /*   @Autowired
    private ProductService productService;

    @RequestMapping(value = "/productss", method = RequestMethod.GET)
    public Iterable<Product> fetchAllProducts() {
        return productService.getAllProducts();
    }



    @RequestMapping(method = RequestMethod.POST,value = "")
    void addProduct(@RequestBody Product product){
        productService.addProduct(product);
    }*/
}
