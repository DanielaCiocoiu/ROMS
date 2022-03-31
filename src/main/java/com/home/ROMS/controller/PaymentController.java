package com.home.ROMS.controller;

import com.home.ROMS.domain.Payment;
import com.home.ROMS.service.PaymentService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Payment create(@RequestBody Payment payment) {
        return paymentService.save(payment);
    }

    @GetMapping
    public List<Payment> getEmployees() {
        return paymentService.findAll();
    }
}
