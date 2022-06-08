package com.thulio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thulio.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
