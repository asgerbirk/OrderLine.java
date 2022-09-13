package com.example.demo.product.service;

import com.example.demo.product.model.Product;
import com.example.demo.product.model.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Optional<Product> find(Long id) {
        return productRepository.findById(id);
    }

    public Product create(Product product) {
        return productRepository.save(product);
    }

    public Product update(Long id, Product product) {
        return productRepository.save( product);
    }

    public Product delete(Long id) {
        boolean checkIfExits = productRepository.existsById(id);
        if (!checkIfExits){
            throw  new IllegalStateException("Student with" + id + "is not in the database");
        }
        productRepository.deleteById(id);
        return null;
    }
}
