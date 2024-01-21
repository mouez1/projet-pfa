package com.gladiators.pi_spring.Entities;

import lombok.*;

import javax.persistence.Entity;

@Getter
@Setter
public class LoginForm {
    private String email;
    private String password;
}
