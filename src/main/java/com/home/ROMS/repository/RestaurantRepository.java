package com.home.ROMS.repository;

import com.home.ROMS.domain.Order;
import com.home.ROMS.domain.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

}
