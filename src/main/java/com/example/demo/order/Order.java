package com.example.demo.order;

import com.example.demo.orderline.OrderLine;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="ORDERS")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date orderDate;

    public Order(Date orderDate) {
        this.orderDate = orderDate;
    }

    @JsonManagedReference
    @OneToMany(mappedBy = "order")
    private List<OrderLine> orderLines;
}
