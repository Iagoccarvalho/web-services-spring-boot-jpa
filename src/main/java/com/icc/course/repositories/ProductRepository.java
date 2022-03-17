package com.icc.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.icc.course.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	
	
}
