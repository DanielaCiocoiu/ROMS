package com.home.ROMS.service.user;

import com.home.ROMS.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

interface UserRepository extends JpaRepository<User, Long> {

}
