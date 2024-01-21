package com.gladiators.pi_spring.Controllers;

import com.gladiators.pi_spring.Entities.LoginForm;
import com.gladiators.pi_spring.Entities.User;
import com.gladiators.pi_spring.Repositories.UserRepository;
import com.gladiators.pi_spring.Services.Implementations.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private AuthService authService;

    public String authenticate(String email, String password) {
        if ("mahmoud.lakhal@esprit.tn".equals(email) && "motdepasse".equals(password)) {
            return "admin";
        } else {
            User user = userRepository.findByEmailAndPassword(email, password);
            return (user != null) ? "client" : "false";
        }
    }


    // AuthController.java
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginForm loginForm) {
        String result = authService.authenticate(loginForm.getEmail(), loginForm.getPassword());

        if ("false".equals(result)) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        } else {
            return ResponseEntity.ok(result);
        }
    }
}