package com.jpa.demogcpproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private Repository repository;

    public Product addNewProduct(Product product) {
        return repository.save(product);
    }
}
