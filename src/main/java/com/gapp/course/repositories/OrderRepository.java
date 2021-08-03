package com.gapp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gapp.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}