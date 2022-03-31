package com.home.ROMS.service.order;

import com.home.ROMS.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

interface OrderRepository extends JpaRepository<Order, Long> {

}
