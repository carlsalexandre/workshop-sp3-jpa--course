package com.meucursoudemy.course.services;

import com.meucursoudemy.course.entities.Product;
import com.meucursoudemy.course.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findbyId(Long id) {
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }
}
