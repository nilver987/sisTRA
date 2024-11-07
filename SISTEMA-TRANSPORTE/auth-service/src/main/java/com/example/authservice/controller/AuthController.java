package com.example.authservice.controller;

import com.example.authservice.model.User;
import com.example.authservice.service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestParam String username, @RequestParam String password) {
        String token = authService.login(username, password);
        return ResponseEntity.ok(token);
    }

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody User user) {
        User newUser = authService.registerUser(user);
        return ResponseEntity.ok(newUser);
    }
}
