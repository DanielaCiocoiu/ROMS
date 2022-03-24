package com.home.ROMS.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String restaurantName;

    @OneToMany(mappedBy = "restaurant")
    private List<Product> serviceProduct = new ArrayList<>();

    public Restaurant() {
    }
}
