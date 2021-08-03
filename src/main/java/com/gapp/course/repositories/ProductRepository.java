package com.gapp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gapp.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}