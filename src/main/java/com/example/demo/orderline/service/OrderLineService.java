package com.example.demo.orderline.service;

import com.example.demo.orderline.model.OrderLine;
import com.example.demo.orderline.model.OrderLineRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.security.PublicKey;
import java.util.List;
import java.util.Optional;

@Service
public class OrderLineService {
    private final OrderLineRepository orderLineRepository;

    public OrderLineService(OrderLineRepository orderLineRepository) {
        this.orderLineRepository = orderLineRepository;
    }

    public Optional<OrderLine> find(Long id) {
        return orderLineRepository.findById(id);
    }

    public List<OrderLine> allOrders(){
        return orderLineRepository.findAll();
    }

    public OrderLine create(OrderLine orderLine) {
        return orderLineRepository.save(orderLine);
    }

    public OrderLine update(Long id, OrderLine orderLine) {
        return orderLineRepository.save( orderLine);
    }

    public OrderLine delete(Long id) {
        orderLineRepository.deleteById(id);
        return null;
    }
}
