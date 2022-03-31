package com.home.ROMS.controller;

import com.home.ROMS.domain.Restaurant;
import com.home.ROMS.service.RestaurantService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {

    private final RestaurantService restaurantService;

    public RestaurantController(RestaurantService restaurantService){
        this.restaurantService = restaurantService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Restaurant create(@RequestBody Restaurant restaurant) {
        return restaurantService.save(restaurant);
    }

    @GetMapping
    public List<Restaurant> getEmployees() {
        return restaurantService.findAll();
    }
}
