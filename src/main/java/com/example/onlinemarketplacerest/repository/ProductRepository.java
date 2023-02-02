package com.example.onlinemarketplacerest.repository;


import com.example.onlinemarketplacerest.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
