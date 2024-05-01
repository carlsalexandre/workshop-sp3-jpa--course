package com.meucursoudemy.course.repositories;

import com.meucursoudemy.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
