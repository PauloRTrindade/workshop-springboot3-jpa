package com.trindadeproject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trindadeproject.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
