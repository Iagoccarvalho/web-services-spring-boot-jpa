package com.icc.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.icc.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	
}
