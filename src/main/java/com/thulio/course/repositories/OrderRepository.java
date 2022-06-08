package com.thulio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thulio.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
