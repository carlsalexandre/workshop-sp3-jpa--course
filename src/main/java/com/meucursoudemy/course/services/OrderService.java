package com.meucursoudemy.course.services;

import com.meucursoudemy.course.entities.Order;
import com.meucursoudemy.course.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findbyId(Long id) {
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}
