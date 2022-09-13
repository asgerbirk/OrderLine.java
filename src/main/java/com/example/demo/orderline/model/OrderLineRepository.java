package com.example.demo.orderline.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface OrderLineRepository extends JpaRepository<OrderLine, Long> {

    Optional<OrderLine> findById(long id);
}