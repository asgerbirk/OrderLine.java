package com.example.demo.product.model;

import com.example.demo.orderline.model.OrderLine;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "PRODUCTS")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "NAME")
    private String name;

    @JsonBackReference
    @OneToMany(mappedBy = "product")
    private List<OrderLine> orderLines;

    public Product(String name) {
        this.name = name;
    }
}
