package com.thulio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thulio.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
