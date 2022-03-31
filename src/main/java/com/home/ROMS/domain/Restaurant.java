package com.home.ROMS.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String restaurantName;

    @OneToMany(mappedBy = "restaurant")
    private List<Product> serviceProduct = new ArrayList<>();

    public Restaurant() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public List<Product> getServiceProduct() {
        return serviceProduct;
    }

    public void setServiceProduct(List<Product> serviceProduct) {
        this.serviceProduct = serviceProduct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Restaurant)) return false;
        Restaurant that = (Restaurant) o;
        return Objects.equals(id, that.id) && Objects.equals(restaurantName, that.restaurantName) && Objects.equals(serviceProduct, that.serviceProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, restaurantName, serviceProduct);
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "id=" + id +
                ", restaurantName='" + restaurantName + '\'' +
                ", serviceProduct=" + serviceProduct +
                '}';
    }
}
