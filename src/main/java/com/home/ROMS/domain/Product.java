package com.home.ROMS.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private double price;

    @Enumerated(EnumType.STRING)
    private Category category;

    @ManyToMany(mappedBy = "products")
    private Set<Order> orders = new HashSet<>();

    @ManyToOne(fetch = FetchType.LAZY)
    private Restaurant restaurant;

    public Product() {
    }
}
