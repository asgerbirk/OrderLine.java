package com.example.demo.product;

import com.example.demo.orderline.OrderLine;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {
    private final CrudRepository<Product, Long> repository;

    public ProductService(CrudRepository<Product, Long> repository) {
        this.repository = repository;
    }

    public Optional<Product> find(Long id) {
        return repository.findById(id);
    }

    public Product create(Product product) {
        return repository.save(product);
    }

    public Product update(Long id, Product product) {
        return repository.save( product);
    }

    public Product delete(Long id) {
        repository.deleteById(id);
        return null;
    }
}
