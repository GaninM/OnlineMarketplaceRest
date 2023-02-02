package com.example.onlinemarketplacerest.service;

import com.example.onlinemarketplacerest.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    void addProduct(Product product);

    List<Product> getAllProduct();

    Optional<Product> findById(Long id);

    void deleteById(Long id);

}
