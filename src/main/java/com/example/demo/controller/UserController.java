package com.example.demo.controller;

import com.example.demo.dto.UserLocationDTO;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/users-location")
    public List<UserLocationDTO> getAllUsersLocation(){
        return userService.getAllUsersLocation();
    }
}
