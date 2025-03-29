package com.lite.app.ms_productos.infra.rest;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;

import com.lite.app.ms_productos.domain.Log;
import com.lite.app.ms_productos.domain.Product;

import jakarta.websocket.server.PathParam;

@RestController
public class ProductController {

    private static final Logger log = LoggerFactory.getLogger(ProductController.class);

    @Value("${app.description}")
    private String description;

    @GetMapping("/products")
    public Product getProducts() {

        Product product = new Product("1", "Product 1", description);
        Log logBean = new Log(product.getId(), product.getName());
           
        
        log.info(null, logBean.getValues());
        return product;
    }

    @GetMapping("/product/{id}")
    public Product getProduct(@PathVariable String id) {

        if (id.equals("0")){
            id = "45";
        }


        Product product = new Product(id, "descripcion", description);
        Log logBean = new Log(product.getId(), product.getName());
           
        
        log.info(null, logBean.getValues());
        return product;
    }



    
}
