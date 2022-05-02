package com.wenderson.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wenderson.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
