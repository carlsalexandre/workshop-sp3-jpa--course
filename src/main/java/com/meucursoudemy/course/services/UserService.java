package com.meucursoudemy.course.services;

import com.meucursoudemy.course.entities.User;
import com.meucursoudemy.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findbyId(Long id) {
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }
}
