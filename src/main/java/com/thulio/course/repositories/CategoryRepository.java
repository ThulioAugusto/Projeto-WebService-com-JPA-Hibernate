package com.thulio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thulio.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
