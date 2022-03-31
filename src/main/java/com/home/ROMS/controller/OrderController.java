package com.home.ROMS.controller;

import com.home.ROMS.domain.Order;
import com.home.ROMS.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService){
        this.orderService = orderService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Order create(@RequestBody Order order) {
        return orderService.save(order);
    }

    @GetMapping
    public List<Order> getEmployees() {
        return orderService.findAll();
    }
}
