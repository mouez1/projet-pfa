package com.gladiators.pi_spring.Services.Implementations;

import com.gladiators.pi_spring.Entities.User;
import com.gladiators.pi_spring.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    public String authenticate(String email, String password) {
        if ("mahmoud.lakhal@esprit.tn".equals(email) && "motdepasse".equals(password)) {
            return "admin";
        } else {
            User user = userRepository.findByEmailAndPassword(email, password);
            return (user != null) ? "client" : "false";
        }
    }
}

