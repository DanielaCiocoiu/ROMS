package com.home.ROMS.service.payment;

import com.home.ROMS.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

interface PaymentRepository extends JpaRepository<Payment, Long> {

}
