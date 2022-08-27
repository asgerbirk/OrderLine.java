package com.example.demo.product;

import com.example.demo.order.Order;
import com.example.demo.orderline.OrderLine;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface ProductRepository extends CrudRepository<Product, Long> {

    Optional<Order> findById(long id);
}