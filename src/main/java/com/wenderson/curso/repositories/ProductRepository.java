package com.wenderson.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wenderson.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
