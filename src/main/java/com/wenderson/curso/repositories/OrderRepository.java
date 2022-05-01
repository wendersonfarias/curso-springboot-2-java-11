package com.wenderson.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wenderson.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
