package com.example.demo.order.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface OrderRepository extends JpaRepository<Order, Long> {

    Optional<Order> findById(long id);
}