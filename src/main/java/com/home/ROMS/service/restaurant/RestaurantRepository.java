package com.home.ROMS.service.restaurant;

import com.home.ROMS.domain.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

}
