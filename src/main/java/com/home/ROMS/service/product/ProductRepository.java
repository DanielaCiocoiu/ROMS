package com.home.ROMS.service.product;

import com.home.ROMS.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

interface ProductRepository extends JpaRepository<Product, Long> {

}
