package com.lite.app.ms_productos.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    
    private String id;
    private String name;
    private String description;

}

