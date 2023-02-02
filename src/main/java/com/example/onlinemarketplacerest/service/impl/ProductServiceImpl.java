package com.example.onlinemarketplacerest.service.impl;

import com.example.onlinemarketplacerest.model.Product;
import com.example.onlinemarketplacerest.repository.ProductRepository;
import com.example.onlinemarketplacerest.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public void addProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public List<Product> getAllProduct() {
        Iterable<Product> iterable = productRepository.findAll();
        List<Product> products = new ArrayList<>();
        for (Product product : iterable) {
            products.add(product);
        }
        return products;
    }

    @Override
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }
}
