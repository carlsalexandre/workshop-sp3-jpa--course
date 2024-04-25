package com.meucursoudemy.course.repositories;

import com.meucursoudemy.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
