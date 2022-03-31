package com.home.ROMS.service;

import com.home.ROMS.domain.Order;
import com.home.ROMS.domain.Payment;
import com.home.ROMS.repository.OrderRepository;
import com.home.ROMS.repository.PaymentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {

    private final PaymentRepository paymentRepository;

    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public Payment save(Payment payment) {
        return paymentRepository.save(payment);
    }

    public List<Payment> findAll() {
        return paymentRepository.findAll();
    }
}
