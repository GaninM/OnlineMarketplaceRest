package com.example.onlinemarketplacerest.controller;

import com.example.onlinemarketplacerest.model.Product;
import com.example.onlinemarketplacerest.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productService.findById(id).get();
    }

    @GetMapping
    public List<Product> getAllProduct() {
        return productService.getAllProduct();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addProduct(@RequestBody Product product) {
        productService.addProduct(product);
    }
}

