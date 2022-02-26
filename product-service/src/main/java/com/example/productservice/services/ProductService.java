package com.example.productservice.services;

import com.example.productservice.entities.Product;
import com.example.productservice.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(Product product){
        return productRepository.save(product);
    }

    public Product findProduct(String id){
        return productRepository.findProductById(id);
    }
}
