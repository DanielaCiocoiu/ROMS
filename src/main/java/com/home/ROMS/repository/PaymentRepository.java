package com.home.ROMS.repository;

import com.home.ROMS.domain.Order;
import com.home.ROMS.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
