package com.lite.app.ms_productos.infra.rest;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;


import com.lite.app.ms_productos.domain.Product;

@RestController
public class ProductController {

    private static final Logger log = LoggerFactory.getLogger(ProductController.class);

    @GetMapping("/products")
    public Product getProducts() {
        //System.out.println("ProductController.getProducts()");
        
        Product product = new Product("1", "Product 1", "Description 1");
        log.info("product: {}", product);
        return product;
    }
    
}
