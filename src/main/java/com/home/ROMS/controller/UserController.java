package com.home.ROMS.controller;

import com.home.ROMS.domain.user.User;
import com.home.ROMS.service.user.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User create(@RequestBody User user) {
        return userService.save(user);
    }

    @GetMapping
    public List<User> getEmployees() {
        return userService.findAll();
    }
}
