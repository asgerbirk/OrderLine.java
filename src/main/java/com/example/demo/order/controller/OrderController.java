package com.example.demo.order.controller;

import com.example.demo.order.model.Order;
import com.example.demo.order.model.OrderRepository;
import com.example.demo.order.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@CrossOrigin // Allow all domain origins.
@RestController
@RequestMapping("api/v1/orders")
public class OrderController {


    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;

    }

    /**
     * Handles getting/finding all orders.
     *
     * @return spaceships
     * @see <a href="http://developer.mozilla.org/en-US/docs/Web/HTTP/Methods/GET">HTTP GET</a>
     */
    @GetMapping
    ResponseEntity<List<Order>> findAll() {
        return ResponseEntity.ok().body(orderService.findAll());
    }

    /**
     * Handles getting/finding an order.
     *
     * @param id
     *
     * @see <a href="http://developer.mozilla.org/en-US/docs/Web/HTTP/Methods/GET">HTTP GET</a>
     */
    @GetMapping("/{id}")
    public ResponseEntity<Order> find(@PathVariable("id") Long id) {
        Optional<Order> item = Optional.of(orderService.find(id)
                .orElseThrow(() -> new RuntimeException("Order %d not found.".formatted(id))));
        return ResponseEntity.ok().body(item.get());
    }

    /**
     * Handles posting/creating an order.
     *
     * @param order
     * @return newly created order
     * @see <a href="http://developer.mozilla.org/en-US/docs/Web/HTTP/Methods/POST">HTTP POST</a>
     */
    @PostMapping
    public ResponseEntity<Order> create(@Valid @RequestBody Order order) {
        Order item = orderService.create(order);
        return ResponseEntity.ok().body(item);
    }

    /**
     * Handles putting an order.
     *
     * @param id
     * @param order
     * @return updated spaceship
     * @see <a href="http://developer.mozilla.org/en-US/docs/Web/HTTP/Methods/PUT">HTTP PUT</a>
     */
    @PutMapping("/{id}")
    public ResponseEntity<Order> put(@PathVariable("id") Long id, @Valid @RequestBody Order order) {
        return ResponseEntity.ok().body(orderService.update(id, order));
    }

    /**
     * Handles patching an order.
     *
     * @param id
     * @param order
     * @return updated order
     * @see <a href="http://developer.mozilla.org/en-US/docs/Web/HTTP/Methods/PATCH">HTTP PATCH</a>
     */
    @PatchMapping("/{id}")
    public ResponseEntity<Order> patch(@PathVariable("id") Long id, @Valid @RequestBody Order order) {
        return ResponseEntity.ok().body(orderService.update(id, order));
    }

    /**
     * Handles deleting an order.
     *
     * @param id
     * @return a null value order
     * @see <a href="http://developer.mozilla.org/en-US/docs/Web/HTTP/Methods/DELETE">HTTP DELETE</a>
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Order> delete(@PathVariable("id") Long id) {
        orderService.find(id).orElseThrow(() -> new RuntimeException("Spaceship %d not found.".formatted(id)));

        Order delete = orderService.delete(id);
        return ResponseEntity.ok().body(delete);
    }

}
