package com.example.demo.order.service;

import com.example.demo.order.model.Order;
import com.example.demo.order.model.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> findAll(){
        return orderRepository.findAll();
    }
    public Optional<Order> find(Long id) {
        return orderRepository.findById(id);
    }

    public Order create(Order order) {
        return orderRepository.save(order);
    }

    public Order update(Long id, Order order) {
        return orderRepository.save( order);
    }

    public Order delete(Long id) {
        orderRepository.deleteById(id);
        return null;
    }
}
