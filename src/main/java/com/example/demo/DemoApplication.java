package com.example.demo;

import com.example.demo.order.Order;
import com.example.demo.order.OrderRepository;
import com.example.demo.orderline.OrderLine;
import com.example.demo.orderline.OrderLineRepository;
import com.example.demo.product.Product;
import com.example.demo.product.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

@SpringBootApplication
public class DemoApplication {

    private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner importData(OrderRepository orderRepository,
                                        OrderLineRepository orderLineRepository,
                                        ProductRepository productRepository) {
        return (args) -> {

            /**
             *  Orders
             */
            final List<Order> orders = new ArrayList<>();
            orders.add(new Order(new Date()));
            orders.add(new Order(new Date()));
            orders.add(new Order(new Date()));
            orderRepository.saveAll(orders);

            /**
             *  Products
             */
            final List<Product> products = new ArrayList<>();
            products.add(new Product("Product 1"));
            products.add(new Product("Product 2"));
            products.add(new Product("Product 3"));
            productRepository.saveAll(products);


            /**
             *  Orderlines.
             */
            final List<OrderLine> orderLines = new ArrayList<>();
            orderLines.add(new OrderLine(orders.get(0), products.get(0)));
            orderLines.add(new OrderLine(orders.get(1), products.get(1)));
            orderLines.add(new OrderLine(orders.get(2), products.get(2)));
            orderLineRepository.saveAll(orderLines);

            log.info("Data import done.");
        };

    }

}
