package com.thulio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thulio.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
