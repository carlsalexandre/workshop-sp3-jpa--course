package com.meucursoudemy.course.config;


import com.meucursoudemy.course.repositories.UserRepository;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig {
    private UserRepository userRepository;
}
